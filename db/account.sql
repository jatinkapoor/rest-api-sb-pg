-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile

DROP SCHEMA IF EXISTS accounts CASCADE;
CREATE SCHEMA accounts AUTHORIZATION postgres;

DROP SEQUENCE IF EXISTS accounts.accounts_id_seq CASCADE;
CREATE SEQUENCE accounts.accounts_id_seq START 1 CACHE 1;
ALTER SEQUENCE accounts.accounts_id_seq OWNER to postgres;

DROP TABLE IF EXISTS accounts.account CASCADE;
CREATE TABLE accounts.account
(
  id integer NOT NULL DEFAULT nextval('accounts.accounts_id_seq'),
  first_name character varying(32) COLLATE pg_catalog."default" NOT NULL,
  last_name character varying(32) COLLATE pg_catalog."default" NOT NULL,
  email character varying(32) COLLATE pg_catalog."default" NOT NULL,
  address character varying(32) COLLATE pg_catalog."default" NOT NULL,
  phone character varying(10)
)
WITH (
  OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE accounts.account OWNER TO postgres;

GRANT ALL ON TABLE accounts.account TO postgres;

INSERT INTO accounts.account(first_name, email, last_name, address, phone) values('roger', 'roger.federer@email.com','federer', '9823 Util Ave', 3235642345);
INSERT INTO accounts.account(first_name, email, last_name, address, phone) values('roger', 'roger.federer@email.com','federer', '2343 York Street', 3235642345);
INSERT INTO accounts.account(first_name, email, last_name, address, phone) values('roger', 'roger.federer@email.com','federer', '9823 Hamline Ave', null);