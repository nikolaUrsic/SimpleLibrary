INSERT INTO public.books(
	author, title, year_of_publication)
	SELECT  'William Shakespeare', 'Hamlet', 1603
	WHERE NOT EXISTS (SELECT * FROM public.books);

INSERT INTO public.book_copies(
	available, book_id)
	SELECT  true, 1
	WHERE NOT EXISTS (SELECT * FROM public.book_copies);

INSERT INTO public.users(
	date_of_birth, deleted, name, sex, surname, validation)
	SELECT '1953-02-25 00:00:00.000' , null , 'John', 'M', 'Doe', null
	WHERE NOT EXISTS (SELECT * FROM public.users);
	
INSERT INTO public.loans(
	actual_return_date, expected_return_date, loan_date, user_id, book_copy_id)
	SELECT '2020-01-20 00:00:00.000', '2020-01-15 00:00:00.000', '2020-01-01 00:00:00.000', 1, 1
	WHERE NOT EXISTS (SELECT * FROM public.loans);