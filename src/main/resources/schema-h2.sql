create table address (uid_pk bigint not null, address_line_one varchar(255), address_line_two varchar(255), city varchar(255), state varchar(255), country varchar(255), postal_code varchar(255), student_uid_pk bigint not null, primary key (uid_pk));

create table student (uid_pk bigint not null, first_name varchar(255), middle_name varchar(255), last_name varchar(255), date_of_birth date, student_id varchar(255), user_name varchar(255), email_address varchar(255), phone_number varchar(255), primary key (uid_pk));
