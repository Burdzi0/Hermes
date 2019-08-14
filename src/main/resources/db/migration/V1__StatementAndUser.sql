CREATE TABLE public.hermes_statements (
    id bigint NOT NULL,
    content text NOT NULL,
    created timestamp without time zone NOT NULL,
    title character varying(255) NOT NULL,
    user_id bigint NOT NULL
);

CREATE TABLE public.hermes_user (
    id bigint NOT NULL,
    password character varying(255) NOT NULL,
    username character varying(255) NOT NULL
);

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;