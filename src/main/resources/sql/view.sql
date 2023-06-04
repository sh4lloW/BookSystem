-- 借阅表视图
CREATE OR REPLACE VIEW reader_book_view
AS
SELECT reader.name AS readerName, book.name AS bookName, borrow.borrow_date, borrow.due_date, borrow.act_due_date
FROM reader, book, borrow
WHERE reader.id = borrow.reader_id AND book.id = borrow.book_id;