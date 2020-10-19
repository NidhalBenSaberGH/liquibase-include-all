--liquibase formatted sql

--changeset nbensaber:0009 Comment: add a new table
CREATE TABLE PASSPORT
   (
		CIN CHAR(8) NOT NULL CONSTRAINT PASSPORT_PK PRIMARY KEY,
		FULL_NAME VARCHAR(255),
		ADDRESS VARCHAR(255),
		AGE NUMERIC
   );