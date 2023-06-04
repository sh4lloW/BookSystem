-- 计算图书应归还日期
CREATE OR REPLACE FUNCTION f_cal_act_due_date(
v_reader_id NUMBER,
v_book_id NUMBER)
RETURN VARCHAR2
AS
    v_book_type NUMBER;
    v_reader_type NUMBER;
    v_date VARCHAR2(255);
BEGIN
    SELECT type INTO v_book_type FROM book WHERE id = v_book_id;
    SELECT type INTO v_reader_type FROM reader WHERE id = v_reader_id;
    SELECT to_char(sysdate + days, 'yyyy-mm-dd') INTO v_date FROM rule WHERE reader_type = v_reader_type AND book_type = v_book_type;
    RETURN v_date;
END;

-- 计算借阅超期天数
CREATE OR REPLACE PROCEDURE p_days_from_due(    
v_reader_id NUMBER,
v_book_id NUMBER,
v_days NUMBER)
AS
BEGIN
    SELECT due_date INTO v_days
    FROM borrow
    WHERE reader_id = v_reader_id AND book_id = v_book_id;
    IF v_days <= 0 THEN
        v_days := 0;
    END IF;
END;