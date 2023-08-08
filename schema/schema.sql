-- drop table if exists public.student;

create table public.student
(
    id         varchar(255) primary key,
    name       varchar(255) not null,
    email      varchar(255) not null,
    phone      varchar(255) not null,
    created_at timestamp    not null default now(),
    updated_at timestamp    not null default now()
);

-- drop table if exists public.vendor;

create table public.vendor
(
    id              UUID primary key,
    name            varchar(255) not null,
    email           varchar(255) not null,
    location        varchar(255) not null,
    acceptingOrders boolean      not null default true,
    qrCode          varchar(255) not null,
    shopImage       varchar(255) not null,
    created_at      timestamp    not null default now(),
    updated_at      timestamp    not null default now()
);

-- drop table if exists public.item;

create table public.item
(
    id              UUID primary key,
    name            varchar(255) not null,
    price           float        not null,
    description     varchar(255) not null,
    image           varchar(255) not null,
    vendor_id       UUID         not null,
    preparationTime int          not null,
    created_at      timestamp    not null default now(),
    updated_at      timestamp    not null default now(),
    foreign key (vendor_id) references vendor (id)
);

-- drop table if exists public.order;

create table public.order
(
    id         UUID primary key,
    student_id varchar(255) not null,
    vendor_id  UUID         not null,
    status     varchar(255) not null,
    otp        varchar(255) not null,
    created_at timestamp    not null default now(),
    updated_at timestamp    not null default now(),
    foreign key (student_id) references student (id),
    foreign key (vendor_id) references vendor (id),
);

-- drop table if exists public.order_items;

create table public.order_items
(
    id         UUID primary key,
    order_id   UUID      not null,
    item_id    UUID      not null,
    quantity   int       not null,
    created_at timestamp not null default now(),
    updated_at timestamp not null default now(),
    foreign key (order_id) references "order" (id),
    foreign key (item_id) references item (id)
);

-- drop table if exists public.order_rating;

create table public.order_rating
(
    id         UUID primary key,
    order_id   UUID         not null,
    rating     int          not null,
    comment    varchar(255) not null,
    created_at timestamp    not null default now(),
    updated_at timestamp    not null default now(),
    foreign key (order_id) references "order" (id)
);

ALTER TABLE public.student
DROP
COLUMN IF EXISTS phone;

ALTER TABLE public.student
    ADD Constraint email_unique UNIQUE (email);
ALTER TABLE public.student
    ADD Constraint phone_unique UNIQUE (phone);

ALTER TABLE public.vendor
    ADD constraint email_unique UNIQUE (email);
alter table public.vendor
    add constraint location_unique UNIQUE (location);
