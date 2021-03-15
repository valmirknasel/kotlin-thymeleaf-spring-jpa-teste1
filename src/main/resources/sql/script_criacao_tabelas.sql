-- Table: public.usuarios

-- DROP TABLE public.usuarios;

CREATE TABLE public.usuarios
(
    id_usuario serial NOT NULL,
    nome character varying(100) NOT NULL,
    login character varying(30) NOT NULL,
    email character varying(30) NOT NULL,
    senha character varying(255) NOT NULL,
    is_ativo boolean NOT NULL,
    CONSTRAINT usuarios_pkey PRIMARY KEY (id_usuario)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.usuarios
    OWNER to postgres;