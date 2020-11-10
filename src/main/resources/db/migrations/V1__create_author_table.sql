create extension if NOT EXISTS "uuid-ossp";

create table Author(
    id uuid default uuid_generate_v4(),
    name varchar not null,
    email varchar not null,
    password varchar not null,
    refresh_token varchar not null
);

alter table Author ADD PRIMARY KEY(id);