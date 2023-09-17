package com.example.mock;

import com.example.mock.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @GetMapping(value = "/api/v1/employees")
    public String employees(@RequestParam String _limit) {
        return """
                { "data": [ { "login": "dbulgakov", "league_guid": "000788f8-a9cd-4926-848b-ceb5996d78fd", "is_active": false, "external": [ { "id": "30480", "system": "PHN" }, { "id": "980672", "system": "DL" } ], "last_name": "Булгаков", "first_name": "Дмитрий", "second_name": "Александрович", "previous_last_name": null, "birthday": "1994-10-19", "corp_email": "dbulgakov@phoenixit.ru", "contact_info": [ { "value": "79250750734", "type": "PHONE", "subtype": "CORPORATE" }, { "value": "79250750734", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2020-03-04", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "b6b33e07-8717-498b-ad23-a7ccca1b4184", "is_active": false, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2020-03-04", "fire_date": "2020-07-06", "secret_access": false, "attributes": [ { "type": "TAB_NUMBER", "value": "0000002361" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "RATE", "value": "1" }, { "type": "POSITION", "value": "Аналитик" }, { "type": "PRACTICE", "value": "df4a11f5-8f78-4075-9472-2b800affc615" } ] } ] }, { "login": "alevin", "league_guid": "000940de-bae9-44c2-9bbe-693b3ea71cd4", "is_active": true, "external": [ { "id": "30943", "system": "PHN" }, { "id": "984111", "system": "DL" } ], "last_name": "Левин", "first_name": "Андрей", "second_name": "Геннадьевич", "previous_last_name": null, "birthday": "1987-01-03", "corp_email": "alevin@phoenixit.ru", "contact_info": [ { "value": "79296099788", "type": "PHONE", "subtype": "PERSONAL" }, { "value": "79296099788", "type": "PHONE", "subtype": "CORPORATE" } ], "league_position": null, "first_hire_date": "2020-07-03", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "0c3f59ff-c928-4161-9d2a-d86b7a855e0e", "is_active": true, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2022-06-23", "fire_date": null, "secret_access": false, "attributes": [ { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "TAB_NUMBER", "value": "0000002662" }, { "type": "RATE", "value": "1" }, { "type": "PRACTICE", "value": "df4a11f5-8f78-4075-9472-2b800affc615" }, { "type": "POSITION", "value": "Ведущий аналитик" } ] }, { "wc_1с_guid": "9899491f-834d-4144-b140-0c7ee77895ab", "is_active": false, "company_league_guid": "2042b324-72c1-4061-87f9-0e7071b79df4", "wc_1с_employee_guid": null, "hire_date": "2022-03-24", "fire_date": "2022-06-22", "secret_access": false, "attributes": [ { "type": "EMPLOYMENT_TYPE", "value": "EE" }, { "type": "TAB_NUMBER", "value": "0000000499" }, { "type": "PRACTICE", "value": "df4a11f5-8f78-4075-9472-2b800affc615" }, { "type": "POSITION", "value": "Ведущий аналитик" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "RATE", "value": "1" } ] } ] }, { "login": "ttolstykh", "league_guid": "00164990-4289-4f28-b8dd-ee2401760a68", "is_active": false, "external": [ { "id": "988908", "system": "DL" }, { "id": "31669", "system": "PHN" } ], "last_name": "Толстых", "first_name": "Татьяна", "second_name": "Владимировна", "previous_last_name": null, "birthday": "1990-12-08", "corp_email": "ttolstykh@phoenixit.ru", "contact_info": [ { "value": "79601307987", "type": "PHONE", "subtype": "CORPORATE" }, { "value": "79601047423", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2020-11-03", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "7e09b5b2-3c8d-4924-b646-0effe9961741", "is_active": false, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2020-11-03", "fire_date": "2021-01-25", "secret_access": false, "attributes": [ { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "POSITION", "value": "Специалист по подбору персонала" }, { "type": "RATE", "value": "1" }, { "type": "PRACTICE", "value": "742e8af6-a176-45a4-b44b-69370ceae100" }, { "type": "OFFICE", "value": "419343b1-2c2b-47bc-98dd-ca2f5f152804" }, { "type": "TAB_NUMBER", "value": "0000003072" } ] } ] }, { "login": "akotovich", "league_guid": "00191799-81e3-401b-a6de-be5cfb1670b2", "is_active": false, "external": [ { "id": "998661", "system": "DL" }, { "id": "34294", "system": "PHN" } ], "last_name": "Котович", "first_name": "Алёна", "second_name": "Александровна", "previous_last_name": null, "birthday": "1994-12-04", "corp_email": "akotovich@phoenixit.ru", "contact_info": [ { "value": "89046012412", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2022-01-24", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "02c42fa2-c326-4947-a095-e1962de2dc52", "is_active": false, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2022-01-24", "fire_date": "2022-03-03", "secret_access": false, "attributes": [ { "type": "OFFICE", "value": "23c7cf82-5ccd-4d07-8cba-69bf23ca9e99" }, { "type": "TAB_NUMBER", "value": "0000005263" }, { "type": "RATE", "value": "1" }, { "type": "PRACTICE", "value": "b2cf1768-da51-424f-a33a-a9d24e4e5be3" }, { "type": "POSITION", "value": "Младший аналитик" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" } ] } ] }, { "login": "dvdmitriev", "league_guid": "00241822-8a35-436c-a931-8628cb5062a0", "is_active": true, "external": [ { "id": "36965", "system": "PHN" }, { "id": "1004677", "system": "DL" } ], "last_name": "Дмитриев", "first_name": "Дмитрий", "second_name": "Валерьевич", "previous_last_name": null, "birthday": "1985-05-10", "corp_email": "dvdmitriev@phoenixit.ru", "contact_info": [ { "value": "79951005427", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2023-03-07", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "c6f853a8-00b9-4097-b125-0c90f3ac415d", "is_active": true, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2023-07-31", "fire_date": null, "secret_access": false, "attributes": [ { "type": "RATE", "value": "1" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "PRACTICE", "value": "df4a11f5-8f78-4075-9472-2b800affc615" }, { "type": "POSITION", "value": "Ведущий разработчик" }, { "type": "TAB_NUMBER", "value": "0000007762" } ] }, { "wc_1с_guid": "b1c563ad-c28d-497b-aa2e-94c1a72b2e07", "is_active": false, "company_league_guid": "2042b324-72c1-4061-87f9-0e7071b79df4", "wc_1с_employee_guid": null, "hire_date": "2023-03-07", "fire_date": "2023-07-28", "secret_access": false, "attributes": [ { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "RATE", "value": "1" }, { "type": "PRACTICE", "value": "06ef7364-d10e-432e-af53-2f8b2823657c" }, { "type": "POSITION", "value": "Старший эксперт" }, { "type": "TAB_NUMBER", "value": "0000000480" } ] } ] }, { "login": "eakovalenko", "league_guid": "002442c1-0baf-4b23-8fdd-d5937c176d5c", "is_active": false, "external": [ { "id": "32223", "system": "PHN" }, { "id": "991612", "system": "DL" } ], "last_name": "Коваленко", "first_name": "Евгений", "second_name": "Александрович", "previous_last_name": null, "birthday": "1998-10-27", "corp_email": "eakovalenko@phoenixit.ru", "contact_info": [ { "value": "79214396909", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2021-03-01", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "d11cc47e-b92c-44dd-9efe-6c9741f2cc68", "is_active": false, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2021-03-01", "fire_date": "2021-07-13", "secret_access": false, "attributes": [ { "type": "RATE", "value": "1" }, { "type": "OFFICE", "value": "23c7cf82-5ccd-4d07-8cba-69bf23ca9e99" }, { "type": "PRACTICE", "value": "df4a11f5-8f78-4075-9472-2b800affc615" }, { "type": "POSITION", "value": "Старший разработчик" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "TAB_NUMBER", "value": "0000003106" } ] } ] }, { "login": "aryzhova", "league_guid": "0027efb1-462e-4c74-9752-56be9aac337b", "is_active": false, "external": [ { "id": "987166", "system": "DL" }, { "id": "24472", "system": "PHN" } ], "last_name": "Рыжова", "first_name": "Анастасия", "second_name": "Сергеевна", "previous_last_name": null, "birthday": "1991-08-14", "corp_email": "aryzhova@phoenixit.ru", "contact_info": [], "league_position": null, "first_hire_date": "2017-06-27", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "8e8817e3-8059-42e2-a73c-3f1520eea5c5", "is_active": false, "company_league_guid": "005c5451-605a-4045-87d8-9d38f7757efe", "wc_1с_employee_guid": null, "hire_date": "2017-06-27", "fire_date": "2017-08-01", "secret_access": false, "attributes": [ { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "RATE", "value": "1" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "POSITION", "value": "Младший юрист" }, { "type": "PRACTICE", "value": "47fda264-36dc-4d7f-89d8-09672aa3274d" } ] } ] }, { "login": "emaklakov", "league_guid": "00319af4-7837-4a6b-a093-cfbb493ba325", "is_active": true, "external": [ { "id": "1004546", "system": "DL" }, { "id": "36909", "system": "PHN" } ], "last_name": "Маклаков", "first_name": "Егор", "second_name": "Сергеевич", "previous_last_name": null, "birthday": "2002-06-25", "corp_email": "emaklakov@phoenixit.ru", "contact_info": [ { "value": "79508782085", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2023-02-27", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "8c49789e-3548-46e5-a9a1-eabeb34b6be5", "is_active": true, "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934", "wc_1с_employee_guid": null, "hire_date": "2023-02-27", "fire_date": null, "secret_access": false, "attributes": [ { "type": "PRACTICE", "value": "81bf78e4-75d9-4d2f-82c1-43f31d75a3f6" }, { "type": "RATE", "value": "1" }, { "type": "OFFICE", "value": "4266e393-469e-49ae-9197-a7ec4ac89898" }, { "type": "TAB_NUMBER", "value": "0000009682" }, { "type": "POSITION", "value": "Аналитик 3 линии поддержки" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" } ] } ] }, { "login": "mkiseleva", "league_guid": "0033102a-21ee-4efe-84e1-c37b2693f3a0", "is_active": true, "external": [ { "id": "36220", "system": "PHN" }, { "id": "1003231", "system": "DL" } ], "last_name": "Киселёва", "first_name": "Мери", "second_name": "Мартиросовна", "previous_last_name": null, "birthday": "1991-12-07", "corp_email": "mkiseleva@phoenixit.ru", "contact_info": [ { "value": "79009595039", "type": "PHONE", "subtype": "PERSONAL" } ], "league_position": null, "first_hire_date": "2022-11-01", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "6a96a523-aad5-4dfa-93ab-1f0ab7df6ae3", "is_active": true, "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3", "wc_1с_employee_guid": null, "hire_date": "2022-11-01", "fire_date": null, "secret_access": false, "attributes": [ { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "POSITION", "value": "Младший тестировщик" }, { "type": "RATE", "value": "1" }, { "type": "TAB_NUMBER", "value": "0000006348" }, { "type": "PRACTICE", "value": "4e4f23a4-e22d-413a-86ad-fc81268fc534" } ] } ] }, { "login": "akorsikova", "league_guid": "00395aba-e6fb-48f4-b70a-61ae2654ac74", "is_active": false, "external": [ { "id": "977766", "system": "DL" }, { "id": "30166", "system": "PHN" } ], "last_name": "Корсикова", "first_name": "Алёна", "second_name": "Александровна", "previous_last_name": null, "birthday": "1995-04-18", "corp_email": "akorsikova@phoenixit.ru", "contact_info": [ { "value": "79093182285", "type": "PHONE", "subtype": "PERSONAL" }, { "value": "79093182285", "type": "PHONE", "subtype": "CORPORATE" } ], "league_position": null, "first_hire_date": "2019-12-04", "gender": null, "additional_work_status": null, "work_conditions": [ { "wc_1с_guid": "ac24127f-8ea5-4233-a842-b95d2779f835", "is_active": false, "company_league_guid": "e6a37296-46d8-4fe4-aaa8-51ce5a8826dd", "wc_1с_employee_guid": null, "hire_date": "2019-12-04", "fire_date": "2021-11-12", "secret_access": false, "attributes": [ { "type": "TAB_NUMBER", "value": "0000000525" }, { "type": "PRACTICE", "value": "540bde98-b059-4611-bc99-69a95324bce9" }, { "type": "OFFICE", "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa" }, { "type": "EMPLOYMENT_TYPE", "value": "BE" }, { "type": "POSITION", "value": "Специалист технической поддержки 1 категории" }, { "type": "RATE", "value": "1" } ] } ] } ], "meta": { "next_link": "/api/v1/employees?_limit=10&cursor.equals=00395aba-e6fb-48f4-b70a-61ae2654ac74", "per_page": 10, "limit": 10, "remaining_pages": 1311 } }
                 """;
    }

    @GetMapping(value = "/api/v1/companies")
    public String companies() {
        return """
                {
                   "data": [
                     {
                       "league_guid": "005c5451-605a-4045-87d8-9d38f7757efe",
                       "external": [
                         {
                           "id": "1296576",
                           "system": "PHN"
                         },
                         {
                           "id": "17",
                           "system": "DL"
                         },
                         {
                           "id": "967e5291-c782-11e6-9844-0cc47a688011",
                           "system": "1C"
                         }
                       ],
                       "name": "ООО «Р.Т Решения»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "2042b324-72c1-4061-87f9-0e7071b79df4",
                       "external": [
                         {
                           "id": "1300889",
                           "system": "PHN"
                         },
                         {
                           "id": "12",
                           "system": "DL"
                         },
                         {
                           "id": "71310006-2b5c-11e7-8b77-00505699bffb",
                           "system": "1C"
                         }
                       ],
                       "name": "ООО «Инлексис»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "2ce2c91a-27e5-448d-9685-b0b349627be1",
                       "external": [
                         {
                           "id": "13",
                           "system": "DL"
                         },
                         {
                           "id": "1300891",
                           "system": "PHN"
                         },
                         {
                           "id": "6932038d-29cd-11e7-9b6a-00505699c789",
                           "system": "1C"
                         }
                       ],
                       "name": "ООО «Мобильные профессионалы»",
                       "legal_address": "",
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "35050742-21a1-45e4-8172-a61052a70f08",
                       "external": [
                         {
                           "id": "8d1dd633-f9d6-11e7-9b0e-005056991e54",
                           "system": "1C"
                         },
                         {
                           "id": "1482671",
                           "system": "PHN"
                         },
                         {
                           "id": "22",
                           "system": "DL"
                         }
                       ],
                       "name": "Лига Цифровой Экономики",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "5e666128-9b5f-41b2-889f-c09065e823c8",
                       "external": [
                         {
                           "id": "1590840",
                           "system": "PHN"
                         },
                         {
                           "id": "32d28b88-e567-11eb-acc0-005056990c7f",
                           "system": "1C"
                         },
                         {
                           "id": "28",
                           "system": "DL"
                         }
                       ],
                       "name": "ООО «ДАТСИС»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "6232567a-bd06-482d-9a9e-cec60094d8ec",
                       "external": [
                         {
                           "id": "14",
                           "system": "DL"
                         },
                         {
                           "id": "006cd17a-318c-11e7-986e-00505699f76d",
                           "system": "1C"
                         },
                         {
                           "id": "1301153",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «М-Клауд»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "63f05d61-b98f-4bcd-bd5d-aea6a1329954",
                       "external": [
                         {
                           "id": "16df4639-e68b-11e7-ae41-0025907546f1",
                           "system": "1C"
                         },
                         {
                           "id": "8",
                           "system": "DL"
                         },
                         {
                           "id": "1355404",
                           "system": "PHN"
                         }
                       ],
                       "name": "АО «Группа ЭйТи»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                       "external": [
                         {
                           "id": "5e9db626-162c-11e7-a43e-00505699c789",
                           "system": "1C"
                         },
                         {
                           "id": "5",
                           "system": "DL"
                         },
                         {
                           "id": "1298009",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «Философия.ИТ»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "8aa7b504-c837-442b-a1c5-60c1a973d290",
                       "external": [
                         {
                           "id": "d1fa4136-099c-11e7-99ea-005056995d11",
                           "system": "1C"
                         },
                         {
                           "id": "7",
                           "system": "DL"
                         },
                         {
                           "id": "1296987",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «Цифровые системы управления»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "907643a5-8cbf-4aa7-a900-157032a0df1f",
                       "external": [
                         {
                           "id": "0a44c2fc-3a13-11eb-8b3b-00505699c789",
                           "system": "1C"
                         },
                         {
                           "id": "25",
                           "system": "DL"
                         },
                         {
                           "id": "1566326",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «Инновационный Центр Философия.ИТ»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "9a9e7963-e56c-472e-a7b9-221e76b05700",
                       "external": [
                         {
                           "id": "24",
                           "system": "DL"
                         },
                         {
                           "id": "4d0fd451-0d1c-11eb-b721-005056990c7f",
                           "system": "1C"
                         },
                         {
                           "id": "1559436",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «АНТЕСТ»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "9faa4e12-002a-418c-b89e-43cbffe3c898",
                       "external": [
                         {
                           "id": "1355405",
                           "system": "PHN"
                         },
                         {
                           "id": "9e5df2f1-e688-11e7-ae41-0025907546f1",
                           "system": "1C"
                         },
                         {
                           "id": "9",
                           "system": "DL"
                         }
                       ],
                       "name": "ООО «ЭйТи Сибирь»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "afb15576-769b-42db-a0e4-f40aedd1b376",
                       "external": [
                         {
                           "id": "5d8a5e52-dfef-11eb-8437-005056992753",
                           "system": "1C"
                         },
                         {
                           "id": "27",
                           "system": "DL"
                         },
                         {
                           "id": "1574075",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «Цифровые экосистемы»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "BLR"
                     },
                     {
                       "league_guid": "b81b91a9-31ea-4396-8be6-94cf42b5d16c",
                       "external": [
                         {
                           "id": "1355407",
                           "system": "PHN"
                         },
                         {
                           "id": "73e02c9d-464d-11e0-8986-96ef18e96e6d",
                           "system": "1C"
                         },
                         {
                           "id": "11",
                           "system": "DL"
                         }
                       ],
                       "name": "ТОО Эй Ти Си Каз",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "KAZ"
                     },
                     {
                       "league_guid": "beae5921-7394-4700-acd9-c14a18a649d3",
                       "external": [
                         {
                           "id": "d79cc195-1d22-11e8-a882-005056995d11",
                           "system": "1C"
                         },
                         {
                           "id": "2",
                           "system": "DL"
                         },
                         {
                           "id": "1359932",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «Орбита успеха»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "c255bbdb-8907-496e-a4df-b7254f74fac7",
                       "external": [
                         {
                           "id": "855d5dc8-72b3-11eb-b43a-005056991e54",
                           "system": "1C"
                         },
                         {
                           "id": "26",
                           "system": "DL"
                         },
                         {
                           "id": "1573826",
                           "system": "PHN"
                         }
                       ],
                       "name": "Лига Цифровой Экономики",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "c78fe85c-c4b9-4065-99c4-11cc0952296c",
                       "external": [
                         {
                           "id": "3",
                           "system": "DL"
                         },
                         {
                           "id": "1327186",
                           "system": "PHN"
                         },
                         {
                           "id": "faca0623-de3a-11e6-ba8a-005056ae21fa",
                           "system": "1C"
                         }
                       ],
                       "name": "ООО «ТЕХКОНСУР»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "e6a37296-46d8-4fe4-aaa8-51ce5a8826dd",
                       "external": [
                         {
                           "id": "63313aed-080f-11e7-85e9-00505699bffb",
                           "system": "1C"
                         },
                         {
                           "id": "1296986",
                           "system": "PHN"
                         },
                         {
                           "id": "6",
                           "system": "DL"
                         }
                       ],
                       "name": "ООО «ТЕКТУС.ИТ»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "e6c92cfb-42b9-456c-8250-0a06154a8996",
                       "external": [
                         {
                           "id": "20",
                           "system": "DL"
                         },
                         {
                           "id": "1354982",
                           "system": "PHN"
                         },
                         {
                           "id": "909402c0-e685-11e7-ae41-0025907546f1",
                           "system": "1C"
                         }
                       ],
                       "name": "ООО «ЭйТи Сервис»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "efc4bf75-beaf-47e4-b89b-95e93d539de6",
                       "external": [
                         {
                           "id": "3e08b790-3656-11e7-9813-00505699c789",
                           "system": "1C"
                         },
                         {
                           "id": "15",
                           "system": "DL"
                         },
                         {
                           "id": "1301423",
                           "system": "PHN"
                         }
                       ],
                       "name": "ООО «Си Икс Лаб»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     },
                     {
                       "league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                       "external": [
                         {
                           "id": "f2f8dd79-e657-11e7-ae41-0025907546f1",
                           "system": "1C"
                         },
                         {
                           "id": "1304122",
                           "system": "PHN"
                         },
                         {
                           "id": "1",
                           "system": "DL"
                         }
                       ],
                       "name": "ООО «ЭйТи Консалтинг»",
                       "legal_address": null,
                       "status": "ACTIVE",
                       "country_code": "RUS"
                     }
                   ],
                   "meta": {
                     "per_page": 21,
                     "limit": 100,
                     "remaining_pages": 0
                   }
                 }
                """;
    }

    @GetMapping(value = "/api/v1/offices")
    public String offices() {
        return """
                {
                    "data": [
                      {
                        "league_guid": "0f118513-ee63-474a-b677-a4eabd9b377e",
                        "external": [
                          {
                            "id": "4553",
                            "system": "DL"
                          },
                          {
                            "id": "1514156",
                            "system": "PHN"
                          },
                          {
                            "id": "1923a356-eb39-11e9-810f-0cc47a93d2f4",
                            "system": "1C"
                          }
                        ],
                        "name": "Севастополь, ул. Руднева, дом 41",
                        "address": null,
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "320b1ba2-ec30-4560-8290-250972114f2c",
                          "name": "Севастополь",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4512",
                              "system": "DL"
                            },
                            {
                              "id": "1514155",
                              "system": "PHN"
                            },
                            {
                              "id": "0c730cac-eb39-11e9-810f-0cc47a93d2f4",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "2003157c-401c-46b5-a5b5-df6b5d67e1cc",
                        "external": [
                          {
                            "id": "1de66d68-4517-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1302327",
                            "system": "PHN"
                          },
                          {
                            "id": "4534",
                            "system": "DL"
                          }
                        ],
                        "name": "Нижний Новгород, ул. Керченская, дом 13",
                        "address": " улица Керченская, дом 13",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "1c2fe9dc-bb2e-437a-88a3-88d9734e1daa",
                          "name": "Нижний Новгород",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1302325",
                              "system": "PHN"
                            },
                            {
                              "id": "4498",
                              "system": "DL"
                            },
                            {
                              "id": "e1807095-4516-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "23c7cf82-5ccd-4d07-8cba-69bf23ca9e99",
                        "external": [
                          {
                            "id": "4537",
                            "system": "DL"
                          },
                          {
                            "id": "1302455",
                            "system": "PHN"
                          },
                          {
                            "id": "471c7609-46ab-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "name": "Санкт-Петербург, 18-я линия Васильевского острова, 29",
                        "address": "18-я линия Васильевского острова, 29",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "147a4166-36f5-4d2f-881f-9b8a3742c880",
                          "name": "Санкт-Петербург",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4493",
                              "system": "DL"
                            },
                            {
                              "id": "1297264",
                              "system": "PHN"
                            },
                            {
                              "id": "922f9b46-2038-11e7-8852-005056991e54",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "2eada80b-4d6d-4d82-a87b-dedd0e83a3cb",
                        "external": [
                          {
                            "id": "922f9b47-2038-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "1297265",
                            "system": "PHN"
                          },
                          {
                            "id": "4528",
                            "system": "DL"
                          }
                        ],
                        "name": "Санкт-Петербург, ул. Выборгская набережная, дом 47",
                        "address": "улица Выборгская набережная, дом 47",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "147a4166-36f5-4d2f-881f-9b8a3742c880",
                          "name": "Санкт-Петербург",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "922f9b46-2038-11e7-8852-005056991e54",
                              "system": "1C"
                            },
                            {
                              "id": "1297264",
                              "system": "PHN"
                            },
                            {
                              "id": "4493",
                              "system": "DL"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "319975a8-cd15-466b-bb4b-9e6f32e7d399",
                        "external": [
                          {
                            "id": "4549",
                            "system": "DL"
                          },
                          {
                            "id": "106fd502-fb63-11e7-80d9-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1350537",
                            "system": "PHN"
                          }
                        ],
                        "name": "Астрахань, ул. Орехово-Зуевская, дом 2",
                        "address": null,
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "5102079e-9dd9-4e69-99a7-dae39d63c617",
                          "name": "Астрахань",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4510",
                              "system": "DL"
                            },
                            {
                              "id": "1350536",
                              "system": "PHN"
                            },
                            {
                              "id": "0a4db88d-fb63-11e7-80d9-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "380fbcf3-dae5-46d6-821c-56bf0c454a8d",
                        "external": [
                          {
                            "id": "0e74234f-1f90-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "4527",
                            "system": "DL"
                          },
                          {
                            "id": "1297263",
                            "system": "PHN"
                          }
                        ],
                        "name": "Таганрог, ул. Греческая, дом 104А",
                        "address": "улица Греческая, дом 104А",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "478e9428-d0b8-4481-9723-875b487b84d7",
                          "name": "Таганрог",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4492",
                              "system": "DL"
                            },
                            {
                              "id": "0e74234e-1f90-11e7-8852-005056991e54",
                              "system": "1C"
                            },
                            {
                              "id": "1297262",
                              "system": "PHN"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "39fe78ed-50a0-4e31-babf-ddb31012157d",
                        "external": [
                          {
                            "id": "4540",
                            "system": "DL"
                          },
                          {
                            "id": "1332029",
                            "system": "PHN"
                          },
                          {
                            "id": "83800bb0-985d-11e7-80c9-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "name": "Белгород, пр-т Богдана Хмельницкого, дом 111",
                        "address": "пр-т Богдана Хмельницкого, д.111",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "86bc7001-49e0-4fa7-a888-3037de38b446",
                          "name": "Белгород",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4506",
                              "system": "DL"
                            },
                            {
                              "id": "1304212",
                              "system": "PHN"
                            },
                            {
                              "id": "f0a6d44e-5d75-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "419343b1-2c2b-47bc-98dd-ca2f5f152804",
                        "external": [
                          {
                            "id": "c0aeef85-26b6-11e7-b6d3-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "4529",
                            "system": "DL"
                          },
                          {
                            "id": "1299141",
                            "system": "PHN"
                          }
                        ],
                        "name": "Воронеж, ул. Красноармейская, дом 52Д",
                        "address": "улица Красноармейская, дом 52Д",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "5597e657-69c8-4c18-a42c-53b8a6072275",
                          "name": "Воронеж",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "c0aeef84-26b6-11e7-b6d3-005056991e54",
                              "system": "1C"
                            },
                            {
                              "id": "4494",
                              "system": "DL"
                            },
                            {
                              "id": "1299140",
                              "system": "PHN"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "4266e393-469e-49ae-9197-a7ec4ac89898",
                        "external": [
                          {
                            "id": "b10ad480-7071-11e8-80e6-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "4551",
                            "system": "DL"
                          },
                          {
                            "id": "1385109",
                            "system": "PHN"
                          }
                        ],
                        "name": "Курск, ул. Карла Маркса, дом 61б",
                        "address": "улица Карла Маркса, дом 61б",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "0d5a919b-dce4-4ea1-a021-d4cd000f7a6f",
                          "name": "Курск",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4499",
                              "system": "DL"
                            },
                            {
                              "id": "1302328",
                              "system": "PHN"
                            },
                            {
                              "id": "61b9441a-4517-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "44d13a5b-e5d1-4ba0-ae44-de77ffb400eb",
                        "external": [
                          {
                            "id": "4550",
                            "system": "DL"
                          },
                          {
                            "id": "1358253",
                            "system": "PHN"
                          },
                          {
                            "id": "a805a6fe-1e20-11e8-80db-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "name": "Москва, ул. Б. Новодмитровская, д. 23, стр. 6",
                        "address": null,
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "7ee7f996-4de8-475d-b14d-aaf3a3fdbe17",
                          "name": "Москва",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1296578",
                              "system": "PHN"
                            },
                            {
                              "id": "4490",
                              "system": "DL"
                            },
                            {
                              "id": "9bbf0144-e85e-11e6-968c-0cc47a688011",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "550f8338-65c4-4a6a-a8a6-31ebec58d3b7",
                        "external": [
                          {
                            "id": "61b9441b-4517-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1302329",
                            "system": "PHN"
                          },
                          {
                            "id": "4535",
                            "system": "DL"
                          }
                        ],
                        "name": "Курск, ул. Ленина, дом 77Б",
                        "address": "улица Ленина, дом 77Б",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "0d5a919b-dce4-4ea1-a021-d4cd000f7a6f",
                          "name": "Курск",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1302328",
                              "system": "PHN"
                            },
                            {
                              "id": "4499",
                              "system": "DL"
                            },
                            {
                              "id": "61b9441a-4517-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "64ed9265-aefb-4c07-9276-1acf8cd73a95",
                        "external": [
                          {
                            "id": "acae555b-1987-11ed-9f06-0050568856fd",
                            "system": "1C"
                          },
                          {
                            "id": "6860",
                            "system": "DL"
                          },
                          {
                            "id": "1635234",
                            "system": "PHN"
                          }
                        ],
                        "name": "Чита_",
                        "address": null,
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "1ed26eb2-bb47-4e80-b068-f20624b092af",
                          "name": "Чита",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4508",
                              "system": "DL"
                            },
                            {
                              "id": "1304225",
                              "system": "PHN"
                            },
                            {
                              "id": "f2f1a0bf-5d76-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "6fabaf5f-abdb-4852-9a3a-fa78acbbd9d6",
                        "external": [
                          {
                            "id": "1332052",
                            "system": "PHN"
                          },
                          {
                            "id": "5ae01af5-986b-11e7-80c9-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "4545",
                            "system": "DL"
                          }
                        ],
                        "name": "Санкт-Петербург, ул. Воронежская, дом 5",
                        "address": "улица Воронежская, дом 5",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "147a4166-36f5-4d2f-881f-9b8a3742c880",
                          "name": "Санкт-Петербург",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1297264",
                              "system": "PHN"
                            },
                            {
                              "id": "4493",
                              "system": "DL"
                            },
                            {
                              "id": "922f9b46-2038-11e7-8852-005056991e54",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "a066e321-ff33-4765-a613-cc4fc2d743c3",
                        "external": [
                          {
                            "id": "1636500",
                            "system": "PHN"
                          },
                          {
                            "id": "6879",
                            "system": "DL"
                          },
                          {
                            "id": "be17eccc-2440-11ed-9f06-0050568856fd",
                            "system": "1C"
                          }
                        ],
                        "name": "Нижний Новгород, ул. Нестерова, д. 9",
                        "address": "улица Нестерова, д. 9",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "1c2fe9dc-bb2e-437a-88a3-88d9734e1daa",
                          "name": "Нижний Новгород",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "e1807095-4516-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            },
                            {
                              "id": "4498",
                              "system": "DL"
                            },
                            {
                              "id": "1302325",
                              "system": "PHN"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "a0763db7-8312-42b4-9b4f-963304a9bc06",
                        "external": [
                          {
                            "id": "6d63b400-986a-11e7-80c9-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1332049",
                            "system": "PHN"
                          },
                          {
                            "id": "4543",
                            "system": "DL"
                          }
                        ],
                        "name": "Красноярск, ул. Авиаторов, дом 19, корп.2",
                        "address": " улица Авиаторов, дом 19, корп.2",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "f3555f88-e5c0-42e4-b45b-636629484254",
                          "name": "Красноярск",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1304204",
                              "system": "PHN"
                            },
                            {
                              "id": "327f8d56-5d75-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            },
                            {
                              "id": "4504",
                              "system": "DL"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "bf962880-efee-430a-a7b6-ffc208a9a97e",
                        "external": [
                          {
                            "id": "1302331",
                            "system": "PHN"
                          },
                          {
                            "id": "acfbe80f-4517-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "4536",
                            "system": "DL"
                          }
                        ],
                        "name": "Киров, ул. Ленина-Горбачева, дом 90/22",
                        "address": "ул. Ленина-Горбачева, д.90/22",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "cafc1b98-8abd-410b-8617-9d0da58c4b67",
                          "name": "Киров",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1302330",
                              "system": "PHN"
                            },
                            {
                              "id": "4500",
                              "system": "DL"
                            },
                            {
                              "id": "acfbe80e-4517-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "d7d0a7c2-5c3e-474b-87f3-2fa83e873d59",
                        "external": [
                          {
                            "id": "4542",
                            "system": "DL"
                          },
                          {
                            "id": "68df3e9e-9869-11e7-80c9-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1332042",
                            "system": "PHN"
                          }
                        ],
                        "name": "Казахстан, г. Алматы, ул. Мынбаева 151",
                        "address": "г. Алматы, ул. Мынбаева 151",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "845f45fe-41fb-4844-b363-69c341d3ab53",
                          "name": "Казахстан",
                          "country_code": "KAZ",
                          "external": [
                            {
                              "id": "4501",
                              "system": "DL"
                            },
                            {
                              "id": "feb7e498-5d73-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            },
                            {
                              "id": "1304201",
                              "system": "PHN"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "d99992b5-a4a8-4844-9749-efde534a2616",
                        "external": [
                          {
                            "id": "e8e03398-4516-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1302326",
                            "system": "PHN"
                          },
                          {
                            "id": "4533",
                            "system": "DL"
                          }
                        ],
                        "name": "Нижний Новгород, пер. Холодный, дом 10-А",
                        "address": "пер. Холодный, дом 10-А",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "1c2fe9dc-bb2e-437a-88a3-88d9734e1daa",
                          "name": "Нижний Новгород",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4498",
                              "system": "DL"
                            },
                            {
                              "id": "1302325",
                              "system": "PHN"
                            },
                            {
                              "id": "e1807095-4516-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "e03da8ab-6101-4073-a056-4596fba970c1",
                        "external": [
                          {
                            "id": "4530",
                            "system": "DL"
                          },
                          {
                            "id": "e0960f2b-26b6-11e7-b6d3-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "1299144",
                            "system": "PHN"
                          }
                        ],
                        "name": "Краснодар, ул. Красная, дом 155, корп. 2-3",
                        "address": "улица Красная, дом 155",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "010af1dc-bf97-40c4-9b38-44251c9cfa39",
                          "name": "Краснодар",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1299143",
                              "system": "PHN"
                            },
                            {
                              "id": "e0960f2a-26b6-11e7-b6d3-005056991e54",
                              "system": "1C"
                            },
                            {
                              "id": "4495",
                              "system": "DL"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa",
                        "external": [
                          {
                            "id": "4524",
                            "system": "DL"
                          },
                          {
                            "id": "9bbf0145-e85e-11e6-968c-0cc47a688011",
                            "system": "1C"
                          },
                          {
                            "id": "1296579",
                            "system": "PHN"
                          }
                        ],
                        "name": "Москва, ул. Большая Новодмитровская, дом 14",
                        "address": "улица Большая Новодмитровская, дом 14",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "7ee7f996-4de8-475d-b14d-aaf3a3fdbe17",
                          "name": "Москва",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1296578",
                              "system": "PHN"
                            },
                            {
                              "id": "4490",
                              "system": "DL"
                            },
                            {
                              "id": "9bbf0144-e85e-11e6-968c-0cc47a688011",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "e58ce362-dbfc-4a3f-bb2e-77c02f50f214",
                        "external": [
                          {
                            "id": "1296823",
                            "system": "PHN"
                          },
                          {
                            "id": "fd5372a3-1395-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "4525",
                            "system": "DL"
                          }
                        ],
                        "name": "Москва 4 (Измайловский вал)",
                        "address": null,
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "7ee7f996-4de8-475d-b14d-aaf3a3fdbe17",
                          "name": "Москва",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4490",
                              "system": "DL"
                            },
                            {
                              "id": "1296578",
                              "system": "PHN"
                            },
                            {
                              "id": "9bbf0144-e85e-11e6-968c-0cc47a688011",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "e73e99a9-6db9-43fb-9a69-ff2558842462",
                        "external": [
                          {
                            "id": "bb17c24e-6afb-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "1327195",
                            "system": "PHN"
                          },
                          {
                            "id": "4538",
                            "system": "DL"
                          }
                        ],
                        "name": "Екатеринбург, ул. Белинского, дом 83",
                        "address": "улица Белинского, дом 83",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "1ee4ee4a-6e3c-469d-8f61-74591246b622",
                          "name": "Екатеринбург",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4496",
                              "system": "DL"
                            },
                            {
                              "id": "1300961",
                              "system": "PHN"
                            },
                            {
                              "id": "d8f841e8-30ad-11e7-b6d3-005056991e54",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "ef2c6957-90f1-480c-800e-e7c0fc05a8c8",
                        "external": [
                          {
                            "id": "879bc014-8574-11eb-8151-0cc47a93d2f4",
                            "system": "1C"
                          },
                          {
                            "id": "5336",
                            "system": "DL"
                          },
                          {
                            "id": "1574546",
                            "system": "PHN"
                          }
                        ],
                        "name": "Беларусь, г. Минск, пр. Независимости, д. 117А-3",
                        "address": "г. Минск, пр. Независимости, д. 117А-3",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "75a8cbed-dbfa-4cd9-bbd5-877a83f7e9f2",
                          "name": "Беларусь",
                          "country_code": "BLR",
                          "external": [
                            {
                              "id": "1574545",
                              "system": "PHN"
                            },
                            {
                              "id": "5335",
                              "system": "DL"
                            },
                            {
                              "id": "747ff1ed-8574-11eb-8151-0cc47a93d2f4",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "f55d20f7-d556-4b65-b5e1-cd404dbfd160",
                        "external": [
                          {
                            "id": "1301951",
                            "system": "PHN"
                          },
                          {
                            "id": "4531",
                            "system": "DL"
                          },
                          {
                            "id": "73de23c7-4056-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "name": "Новосибирск,  ул. Коммунистическая, дом 40",
                        "address": "улица Коммунистическая, дом 40",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "0c8adbe1-5a53-48af-becc-15767d34ca20",
                          "name": "Новосибирск",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1296825",
                              "system": "PHN"
                            },
                            {
                              "id": "4491",
                              "system": "DL"
                            },
                            {
                              "id": "abe2b138-030b-11e7-b398-0cc47a688011",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "f56c9d1c-754b-42d8-8191-aef97c67d994",
                        "external": [
                          {
                            "id": "1509918",
                            "system": "PHN"
                          },
                          {
                            "id": "a949347f-d2fd-11e9-810a-0cc47a93d2f4",
                            "system": "1C"
                          },
                          {
                            "id": "4552",
                            "system": "DL"
                          }
                        ],
                        "name": "Волгоград, ул. Баррикадная, дом 1Б",
                        "address": " улица Баррикадная, дом 1Б",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "e1c65855-1f18-4435-bf71-9d138df33eb2",
                          "name": "Волгоград",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "1509917",
                              "system": "PHN"
                            },
                            {
                              "id": "4511",
                              "system": "DL"
                            },
                            {
                              "id": "9eff82ca-d2fd-11e9-810a-0cc47a93d2f4",
                              "system": "1C"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "f5fa9e82-1377-495f-a935-e49949072c34",
                        "external": [
                          {
                            "id": "ba99397d-1481-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "4526",
                            "system": "DL"
                          },
                          {
                            "id": "1296824",
                            "system": "PHN"
                          }
                        ],
                        "name": "Москва, ул. 2-я Хуторская, дом 38А, стр. 14",
                        "address": "улица 2-я Хуторская, дом 38А, стр. 14",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "7ee7f996-4de8-475d-b14d-aaf3a3fdbe17",
                          "name": "Москва",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4490",
                              "system": "DL"
                            },
                            {
                              "id": "9bbf0144-e85e-11e6-968c-0cc47a688011",
                              "system": "1C"
                            },
                            {
                              "id": "1296578",
                              "system": "PHN"
                            }
                          ]
                        }
                      },
                      {
                        "league_guid": "fa5e042a-10d9-4e19-801b-6ee1965a74b5",
                        "external": [
                          {
                            "id": "4532",
                            "system": "DL"
                          },
                          {
                            "id": "1302205",
                            "system": "PHN"
                          },
                          {
                            "id": "770ddd11-4462-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "name": "Ярославль, ул. Тургенева, дом 17",
                        "address": "улица Тургенева, дом 17",
                        "status": "ACTIVE",
                        "region": {
                          "league_guid": "1b339042-8fcc-4739-8a8b-11c73fd3cd09",
                          "name": "Ярославль",
                          "country_code": "RUS",
                          "external": [
                            {
                              "id": "4497",
                              "system": "DL"
                            },
                            {
                              "id": "1302204",
                              "system": "PHN"
                            },
                            {
                              "id": "5be42ed5-4462-11e7-80c2-0cc47a93d2f5",
                              "system": "1C"
                            }
                          ]
                        }
                      }
                    ],
                    "meta": {
                      "per_page": 27,
                      "limit": 100,
                      "remaining_pages": 0
                    }
                  }
                """;
    }

    @GetMapping(value = "/api/v1/practices")
    public String practices() {
        return """
                {
                    "data": [
                      
                      {
                        "is_active": true,
                        "league_guid": "887338d4-4458-4b5c-9511-630041a97b3b",
                        "external": [
                          {
                            "id": "11159",
                            "system": "PHN"
                          },
                          {
                            "id": "cf577b5e-2a02-11e9-80f5-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "63",
                            "system": "DL"
                          }
                        ],
                        "short_code": "ECS",
                        "name": "Практика Решений для электронной коммерции",
                        "head_guid": "7b58ece9-5041-499e-b340-413df135cc0c",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": [
                          {
                            "guid": "4dbd4029-03b0-451c-97b6-5f8e660b4fc7",
                            "type": "BASE"
                          },
                          {
                            "guid": "6a7b9af2-377c-4c0e-859a-f7c02ce799bf",
                            "type": "MAIN"
                          },
                          {
                            "guid": "6a7b9af2-377c-4c0e-859a-f7c02ce799bf",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "8c56d175-c872-4801-bcfc-9f1b5aad2835",
                        "external": [
                          {
                            "id": "6794",
                            "system": "PHN"
                          },
                          {
                            "id": "8909769a-ea20-11e6-b40b-0cc47a688011",
                            "system": "1C"
                          },
                          {
                            "id": "14",
                            "system": "DL"
                          }
                        ],
                        "short_code": "BD",
                        "name": "BD_Администрация блока BI",
                        "head_guid": "492e50dc-5329-445d-8c1b-c3f38111422a",
                        "block_guid": "2b7ca9b8-1c04-41d9-99c3-e4c31bb488ff",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "8cad2f1c-4c50-4560-baaa-4e21fbd4fe84",
                        "external": [
                          {
                            "id": "206",
                            "system": "DL"
                          },
                          {
                            "id": "6901",
                            "system": "PHN"
                          },
                          {
                            "id": "64094f83-3bb4-11e7-80c0-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "short_code": "OSS",
                        "name": "Практика OSS",
                        "head_guid": "0e3c0a72-92fc-4063-8843-33dde039eea5",
                        "block_guid": "6142b81c-d22f-47c5-af24-472dd803fb9a",
                        "assistant": [
                          {
                            "guid": "56ff71fa-c610-4162-bc29-1200fe0c2574",
                            "type": "BASE"
                          },
                          {
                            "guid": "842b02c5-3793-4f10-9049-857850ac16c8",
                            "type": "MAIN"
                          },
                          {
                            "guid": "842b02c5-3793-4f10-9049-857850ac16c8",
                            "type": "BASE"
                          },
                          {
                            "guid": "56ff71fa-c610-4162-bc29-1200fe0c2574",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "8ffc55e8-f1c5-46af-b1cc-a97129010179",
                        "external": [
                          {
                            "id": "212",
                            "system": "DL"
                          },
                          {
                            "id": "9983",
                            "system": "PHN"
                          },
                          {
                            "id": "7967631a-90df-11e8-80e8-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "short_code": "LAW",
                        "name": "Юридическая практика КЦ",
                        "head_guid": "3848f5d1-03b9-4a8a-b475-0dcfdc17b5f7",
                        "block_guid": "4c13ad04-a9da-417a-86ca-b29ae439deec",
                        "assistant": [
                          {
                            "guid": "8105974c-0bb1-41ec-9ca8-c17c71063c50",
                            "type": "MAIN"
                          },
                          {
                            "guid": "8105974c-0bb1-41ec-9ca8-c17c71063c50",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "90edb5df-0c3a-49b9-a204-237fdd4f31b0",
                        "external": [
                          {
                            "id": "ff8f406b-12b7-11e7-90fa-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "6826",
                            "system": "PHN"
                          },
                          {
                            "id": "69",
                            "system": "DL"
                          }
                        ],
                        "short_code": "ITSM",
                        "name": "Практика ITSM",
                        "head_guid": "5f4be43d-5417-4410-83fd-8fac08238b2f",
                        "block_guid": "a165a96c-2bfa-4c17-a0bc-dd5dcdd8adfd",
                        "assistant": [
                          {
                            "guid": "3a21e2b8-e981-4cfe-84f2-5bde5782aaa7",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "911e3615-0856-4851-ac80-5fe189016b05",
                        "external": [
                          {
                            "id": "13888",
                            "system": "PHN"
                          },
                          {
                            "id": "4582",
                            "system": "DL"
                          },
                          {
                            "id": "03cd138f-7984-11ea-8122-0cc47a93d2f4",
                            "system": "1C"
                          }
                        ],
                        "short_code": "KOORD",
                        "name": "Практика \\"Управление и контроль\\"",
                        "head_guid": "1371b277-7cb6-407a-b638-a209a98f9ef8",
                        "block_guid": "8a0145f9-c76a-42d7-9920-6a16e20f1814",
                        "assistant": [
                          {
                            "guid": "8105974c-0bb1-41ec-9ca8-c17c71063c50",
                            "type": "BASE"
                          },
                          {
                            "guid": "339265d5-dfec-4a6d-a5ed-bd9a92ae6d95",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "92296baf-e23e-4445-ad8c-956394c525c9",
                        "external": [
                          {
                            "id": "ae977ddf-c9f7-11eb-815d-0cc47a93d2f4",
                            "system": "1C"
                          },
                          {
                            "id": "5653",
                            "system": "DL"
                          },
                          {
                            "id": "16945",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "ACAD",
                        "name": "Платформа Академии Лиги",
                        "head_guid": "97fd04b8-5202-4a07-9017-d030f510a25e",
                        "block_guid": "2b7ca9b8-1c04-41d9-99c3-e4c31bb488ff",
                        "assistant": [
                          {
                            "guid": "dae2b7d1-4a6d-4616-9969-1f79b35e312c",
                            "type": "MAIN"
                          },
                          {
                            "guid": "dae2b7d1-4a6d-4616-9969-1f79b35e312c",
                            "type": "BASE"
                          },
                          {
                            "guid": "dae283e8-30ff-45aa-ac4f-26f25f428e1d",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "934a25b6-b910-4c50-b7a2-8ac751eaa3ba",
                        "external": [
                          {
                            "id": "6869",
                            "system": "PHN"
                          },
                          {
                            "id": "65a9f377-2116-11e7-b6d3-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "56",
                            "system": "DL"
                          }
                        ],
                        "short_code": "BD",
                        "name": "BD_Администрация блока INV",
                        "head_guid": "8305a4f1-bccb-4cd5-858b-5c95e0b05eac",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "95a931c2-719e-4cd7-a935-78f27fba6a90",
                        "external": [
                          {
                            "id": "5268",
                            "system": "DL"
                          },
                          {
                            "id": "ff3b6abf-7291-11eb-814f-0cc47a93d2f4",
                            "system": "1C"
                          },
                          {
                            "id": "16060",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "DPT",
                        "name": "Тестирование Цифровых Платформ",
                        "head_guid": "e2b0505b-6f73-41ee-8d55-05b943599bd2",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": [
                          {
                            "guid": "b08988a7-40b6-4240-b87d-3d749922df5e",
                            "type": "BASE"
                          },
                          {
                            "guid": "b382854d-f03e-4ed6-a0a5-ba36b26e42b8",
                            "type": "BASE"
                          },
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "BASE"
                          },
                          {
                            "guid": "cb5a7a52-7e4e-43f4-8247-b1b27f3988ff",
                            "type": "MAIN"
                          },
                          {
                            "guid": "4dbd4029-03b0-451c-97b6-5f8e660b4fc7",
                            "type": "BASE"
                          },
                          {
                            "guid": "cb5a7a52-7e4e-43f4-8247-b1b27f3988ff",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "95dacc0a-68c0-4829-9b62-4fc0b3841153",
                        "external": [
                          {
                            "id": "20",
                            "system": "DL"
                          },
                          {
                            "id": "6886",
                            "system": "PHN"
                          },
                          {
                            "id": "667611bc-2b46-11e7-b6d3-005056991e54",
                            "system": "1C"
                          }
                        ],
                        "short_code": "BIC",
                        "name": "ЦК BI",
                        "head_guid": "8d8558a9-595b-4d27-bb19-cbc72db2153c",
                        "block_guid": "2b7ca9b8-1c04-41d9-99c3-e4c31bb488ff",
                        "assistant": [
                          {
                            "guid": "dae2b7d1-4a6d-4616-9969-1f79b35e312c",
                            "type": "BASE"
                          },
                          {
                            "guid": "dae2b7d1-4a6d-4616-9969-1f79b35e312c",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "961fe1ce-df32-49f2-b072-b7396308dc18",
                        "external": [
                          {
                            "id": "6799",
                            "system": "PHN"
                          },
                          {
                            "id": "b942115a-ea20-11e6-b40b-0cc47a688011",
                            "system": "1C"
                          },
                          {
                            "id": "67",
                            "system": "DL"
                          }
                        ],
                        "short_code": "NN",
                        "name": "Администрация блока BKS",
                        "head_guid": "29dff79a-ee74-49eb-b9e4-c4b5e5acf6e5",
                        "block_guid": "a165a96c-2bfa-4c17-a0bc-dd5dcdd8adfd",
                        "assistant": [
                          {
                            "guid": "6fccd9d0-8430-4e6c-bdcd-0c45d2e8f457",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "967aa329-d9f6-41af-80f4-d522b6fb5749",
                        "external": [
                          {
                            "id": "35",
                            "system": "DL"
                          },
                          {
                            "id": "3d7edc03-190f-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "6851",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "SBS",
                        "name": "Практика развития экосистем",
                        "head_guid": "a2733ede-05e8-474b-b0d3-b8fa121c9d1f",
                        "block_guid": "3a4ca45f-94eb-4928-a165-dc285d634705",
                        "assistant": [
                          {
                            "guid": "d91d5459-7caf-41d5-8741-eadfbe1f7ea1",
                            "type": "BASE"
                          },
                          {
                            "guid": "d91d5459-7caf-41d5-8741-eadfbe1f7ea1",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "96e5b031-0ffc-4ee8-9ef7-e6c46f97e5f9",
                        "external": [
                          {
                            "id": "102",
                            "system": "DL"
                          },
                          {
                            "id": "a8128bef-1398-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "6834",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "SEC",
                        "name": "Дирекция по безопасности",
                        "head_guid": "f59ab94e-572a-4fba-8977-c4a8a928d3f9",
                        "block_guid": "11d4eafb-6073-4908-8993-cf53f602d7ab",
                        "assistant": [
                          {
                            "guid": "8105974c-0bb1-41ec-9ca8-c17c71063c50",
                            "type": "MAIN"
                          },
                          {
                            "guid": "43d61209-0696-4a26-96eb-72bed9ce548f",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "98a50119-87ff-456b-89b7-6b0d7cf5f40c",
                        "external": [
                          {
                            "id": "6809",
                            "system": "PHN"
                          },
                          {
                            "id": "33",
                            "system": "DL"
                          },
                          {
                            "id": "e151155a-ea21-11e6-b40b-0cc47a688011",
                            "system": "1C"
                          }
                        ],
                        "short_code": "BSS",
                        "name": "Практика BSS",
                        "head_guid": "5753e339-76c4-4020-a3c7-725675010ec9",
                        "block_guid": "3a4ca45f-94eb-4928-a165-dc285d634705",
                        "assistant": [
                          {
                            "guid": "e9cca0b1-9b8c-4a62-a195-41de989f93c2",
                            "type": "BASE"
                          },
                          {
                            "guid": "2435de91-f2eb-4f46-8111-f5e669532719",
                            "type": "BASE"
                          },
                          {
                            "guid": "2435de91-f2eb-4f46-8111-f5e669532719",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "9ab7977d-0266-441e-8a42-adcb9b71c0cb",
                        "external": [
                          {
                            "id": "209",
                            "system": "DL"
                          },
                          {
                            "id": "a8bc457e-325c-11e8-80de-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "9226",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "TM",
                        "name": "Дирекция Автоматизация транспортной логистики",
                        "head_guid": "39a1d06f-0e83-4dfb-bee7-cefab111bc63",
                        "block_guid": "6142b81c-d22f-47c5-af24-472dd803fb9a",
                        "assistant": [
                          {
                            "guid": "0a3ecac9-5fbe-4972-831a-8b79531c4396",
                            "type": "BASE"
                          },
                          {
                            "guid": "0a3ecac9-5fbe-4972-831a-8b79531c4396",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "9eb86bd0-9f20-4d91-a0f3-ea5e9342fe88",
                        "external": [
                          {
                            "id": "9227",
                            "system": "PHN"
                          },
                          {
                            "id": "ad8be2e2-325d-11e8-80de-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "210",
                            "system": "DL"
                          }
                        ],
                        "short_code": "NNCPM",
                        "name": "Администрация CPM",
                        "head_guid": "39a1d06f-0e83-4dfb-bee7-cefab111bc63",
                        "block_guid": "6142b81c-d22f-47c5-af24-472dd803fb9a",
                        "assistant": [
                          {
                            "guid": "0a3ecac9-5fbe-4972-831a-8b79531c4396",
                            "type": "MAIN"
                          },
                          {
                            "guid": "0a3ecac9-5fbe-4972-831a-8b79531c4396",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "a0dd7a6d-e47a-4044-83aa-20d962f1b330",
                        "external": [
                          {
                            "id": "20257",
                            "system": "PHN"
                          },
                          {
                            "id": "d875a229-ac74-11ed-9f1c-0050568856fd",
                            "system": "1C"
                          },
                          {
                            "id": "7310",
                            "system": "DL"
                          }
                        ],
                        "short_code": "RPA",
                        "name": "Администрация клиентского сервиса",
                        "head_guid": "246f008a-fba1-4b54-81c7-f01774bc6988",
                        "block_guid": "3a4ca45f-94eb-4928-a165-dc285d634705",
                        "assistant": [
                          {
                            "guid": "947f85e2-92bc-4e78-a922-c5d34a6c51ac",
                            "type": "BASE"
                          },
                          {
                            "guid": "40ba2c2a-377a-4afa-8263-c3c7d6c5b623",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "a3c1362f-3174-4362-8133-e334c434e5eb",
                        "external": [
                          {
                            "id": "199",
                            "system": "DL"
                          },
                          {
                            "id": "9f13f0f2-57de-11ea-8120-0cc47a93d2f4",
                            "system": "1C"
                          },
                          {
                            "id": "13653",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "HRD",
                        "name": "Внутренние проекты дирекции по развитию персонала",
                        "head_guid": "c0b3e3dc-16d3-4e22-b182-27a0a7ebfa9d",
                        "block_guid": "af3497a4-5ae2-412a-95d8-5be58f412e77",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "a47cb105-3ecd-445e-bbc5-21949199d86c",
                        "external": [
                          {
                            "id": "65ebcda9-12b6-11e7-90fa-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "6823",
                            "system": "PHN"
                          },
                          {
                            "id": "155",
                            "system": "DL"
                          }
                        ],
                        "short_code": "TMP",
                        "name": "Практика Temporal",
                        "head_guid": null,
                        "block_guid": "8a0145f9-c76a-42d7-9920-6a16e20f1814",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "af17cbf9-0df2-4dd0-bcf0-78b34369a215",
                        "external": [
                          {
                            "id": "12691",
                            "system": "PHN"
                          },
                          {
                            "id": "3d630469-ea9b-11e9-810e-0cc47a93d2f4",
                            "system": "1C"
                          },
                          {
                            "id": "186",
                            "system": "DL"
                          }
                        ],
                        "short_code": "SEV",
                        "name": "Офис Севастополь",
                        "head_guid": "440116a0-b067-4506-a69f-c1085c510c60",
                        "block_guid": "87461da2-e93b-4bcd-b266-1d28063e14c8",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "b180fc74-be15-4460-82e0-5e7f808a6274",
                        "external": [
                          {
                            "id": "169",
                            "system": "DL"
                          },
                          {
                            "id": "6899",
                            "system": "PHN"
                          },
                          {
                            "id": "e00afa17-3614-11e7-80bf-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "short_code": "KSD",
                        "name": "Офис Краснодар",
                        "head_guid": "440116a0-b067-4506-a69f-c1085c510c60",
                        "block_guid": "87461da2-e93b-4bcd-b266-1d28063e14c8",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "b299ea52-faf2-45c0-b0f0-8461dc7d85a1",
                        "external": [
                          {
                            "id": "eecb5d09-ac74-11ed-9f1c-0050568856fd",
                            "system": "1C"
                          },
                          {
                            "id": "7311",
                            "system": "DL"
                          },
                          {
                            "id": "20258",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "MN",
                        "name": "Администрация МН",
                        "head_guid": "87ddc25b-bfe0-48dc-8a1a-875692cab169",
                        "block_guid": "6142b81c-d22f-47c5-af24-472dd803fb9a",
                        "assistant": [
                          {
                            "guid": "50572276-444c-4df7-b55c-220d8662c5b8",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b2cf1768-da51-424f-a33a-a9d24e4e5be3",
                        "external": [
                          {
                            "id": "773240e0-292b-11e9-80f5-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "32",
                            "system": "DL"
                          },
                          {
                            "id": "11138",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "FINTECH",
                        "name": "Практика Финансовые технологии",
                        "head_guid": "788fb352-63f6-4d93-bed8-c90fcc98eace",
                        "block_guid": "2b7ca9b8-1c04-41d9-99c3-e4c31bb488ff",
                        "assistant": [
                          {
                            "guid": "d288716b-2345-4012-abed-983f5370451d",
                            "type": "MAIN"
                          },
                          {
                            "guid": "dae2b7d1-4a6d-4616-9969-1f79b35e312c",
                            "type": "BASE"
                          },
                          {
                            "guid": "1378db04-37f3-4029-8fe9-370851d6fb6f",
                            "type": "BASE"
                          },
                          {
                            "guid": "d288716b-2345-4012-abed-983f5370451d",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b35c4abe-3d6e-46c5-9d8a-20164d86e2cb",
                        "external": [
                          {
                            "id": "6634d9b5-2039-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "108",
                            "system": "DL"
                          },
                          {
                            "id": "6865",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "MAR",
                        "name": "Дирекция по маркетингу",
                        "head_guid": "3a656df9-42b3-4a51-a23c-56b2b86419ce",
                        "block_guid": "11d4eafb-6073-4908-8993-cf53f602d7ab",
                        "assistant": [
                          {
                            "guid": "43d61209-0696-4a26-96eb-72bed9ce548f",
                            "type": "MAIN"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b39c0e12-2e92-4d0f-ad20-27175720d030",
                        "external": [
                          {
                            "id": "43",
                            "system": "DL"
                          },
                          {
                            "id": "28cfa7f9-1580-11e8-80db-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "9030",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "LOY",
                        "name": "ЦК Управление лояльностью",
                        "head_guid": "016c4daa-cc6c-451d-acaf-b8b05d690bce",
                        "block_guid": "3a4ca45f-94eb-4928-a165-dc285d634705",
                        "assistant": [
                          {
                            "guid": "40ba2c2a-377a-4afa-8263-c3c7d6c5b623",
                            "type": "BASE"
                          },
                          {
                            "guid": "947f85e2-92bc-4e78-a922-c5d34a6c51ac",
                            "type": "BASE"
                          },
                          {
                            "guid": "947f85e2-92bc-4e78-a922-c5d34a6c51ac",
                            "type": "MAIN"
                          },
                          {
                            "guid": "3db03600-f662-4a13-82b2-49515886e1cc",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b3a2b986-7ea4-4a34-8721-0238d8fa9e96",
                        "external": [
                          {
                            "id": "97afcd13-13ab-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "54",
                            "system": "DL"
                          },
                          {
                            "id": "6835",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "SPO",
                        "name": "Практика Спорт",
                        "head_guid": "fa85ea60-f889-43d2-a12a-a87b5bc9bc88",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": [
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "MAIN"
                          },
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "BASE"
                          },
                          {
                            "guid": "4dbd4029-03b0-451c-97b6-5f8e660b4fc7",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b42d9e8b-7338-4394-883d-c6bafac8595b",
                        "external": [
                          {
                            "id": "207",
                            "system": "DL"
                          },
                          {
                            "id": "6909",
                            "system": "PHN"
                          },
                          {
                            "id": "18898773-412f-11e7-80c2-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "short_code": "BD",
                        "name": "BD_Администрация блока ERP",
                        "head_guid": "a3c83fbb-fc7a-42b2-8b08-5595474894ea",
                        "block_guid": "6142b81c-d22f-47c5-af24-472dd803fb9a",
                        "assistant": [
                          {
                            "guid": "56ff71fa-c610-4162-bc29-1200fe0c2574",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b434583e-f0b9-41bc-b480-22d12dd9663e",
                        "external": [
                          {
                            "id": "9028",
                            "system": "PHN"
                          },
                          {
                            "id": "60",
                            "system": "DL"
                          },
                          {
                            "id": "daa81048-157c-11e8-80db-0cc47a93d2f5",
                            "system": "1C"
                          }
                        ],
                        "short_code": "ECO",
                        "name": "Практика Цифровых экосистем",
                        "head_guid": "bc8ee4c6-929d-4462-8132-135c622392a7",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": [
                          {
                            "guid": "879dd240-8450-4c8a-bc07-f4a3b59b14c1",
                            "type": "MAIN"
                          },
                          {
                            "guid": "879dd240-8450-4c8a-bc07-f4a3b59b14c1",
                            "type": "BASE"
                          },
                          {
                            "guid": "b08988a7-40b6-4240-b87d-3d749922df5e",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b6a4c57e-5995-4af5-b69e-1dd8b100a0cf",
                        "external": [
                          {
                            "id": "03410f9a-ea21-11e6-b40b-0cc47a688011",
                            "system": "1C"
                          },
                          {
                            "id": "51",
                            "system": "DL"
                          },
                          {
                            "id": "6803",
                            "system": "PHN"
                          }
                        ],
                        "short_code": "OUT",
                        "name": "Практика аутсорсинга",
                        "head_guid": "8f015d85-453b-4bce-913a-36ead8b69c65",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": [
                          {
                            "guid": "4dbd4029-03b0-451c-97b6-5f8e660b4fc7",
                            "type": "BASE"
                          },
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "BASE"
                          },
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "MAIN"
                          },
                          {
                            "guid": "b08988a7-40b6-4240-b87d-3d749922df5e",
                            "type": "BASE"
                          }
                        ]
                      },
                      {
                        "is_active": true,
                        "league_guid": "b6fcb4b5-391d-442a-8e67-06652839a397",
                        "external": [
                          {
                            "id": "8017",
                            "system": "DL"
                          },
                          {
                            "id": "20270",
                            "system": "PHN"
                          },
                          {
                            "id": "0c6a2507-f664-11ed-9f27-00505699e005",
                            "system": "1C"
                          }
                        ],
                        "short_code": "BD",
                        "name": "BD_Администрация блока DSB",
                        "head_guid": "b59500fd-d08f-4e09-aa20-ec71a64c9ec5",
                        "block_guid": "2598b96b-a834-477c-aa05-4f8394d02ffa",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "b9b63f77-9454-41b0-aa20-4312d8d492c2",
                        "external": [
                          {
                            "id": "6837",
                            "system": "PHN"
                          },
                          {
                            "id": "788f072f-13ac-11e7-8852-005056991e54",
                            "system": "1C"
                          },
                          {
                            "id": "188",
                            "system": "DL"
                          }
                        ],
                        "short_code": "FIN",
                        "name": "Внутренние проекты Финансово-юридической дирекции",
                        "head_guid": "7ab092b4-3fcd-4fb3-9416-61a722d6450c",
                        "block_guid": "af3497a4-5ae2-412a-95d8-5be58f412e77",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "b9c759a5-760b-425f-8aca-aba780d9bd24",
                        "external": [
                          {
                            "id": "7301",
                            "system": "DL"
                          },
                          {
                            "id": "20250",
                            "system": "PHN"
                          },
                          {
                            "id": "baca75fb-abad-11ed-9f1c-0050568856fd",
                            "system": "1C"
                          }
                        ],
                        "short_code": "NN",
                        "name": "Администрация блока Цифровых Решений",
                        "head_guid": null,
                        "block_guid": "2598b96b-a834-477c-aa05-4f8394d02ffa",
                        "assistant": []
                      },
                      {
                        "is_active": true,
                        "league_guid": "bbb271c9-5a87-4a1c-82e7-fd5e971f3861",
                        "external": [
                          {
                            "id": "11158",
                            "system": "PHN"
                          },
                          {
                            "id": "56dbf4dc-2a02-11e9-80f5-0cc47a93d2f5",
                            "system": "1C"
                          },
                          {
                            "id": "62",
                            "system": "DL"
                          }
                        ],
                        "short_code": "DMS",
                        "name": "Практика Цифровых Платформ и Мобильных Решений",
                        "head_guid": "1ebe7477-78c1-4a47-b8ed-f08ba8c1a098",
                        "block_guid": "86a32e77-bd14-41c1-a962-400793276a8c",
                        "assistant": [
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "MAIN"
                          },
                          {
                            "guid": "4dbd4029-03b0-451c-97b6-5f8e660b4fc7",
                            "type": "BASE"
                          },
                          {
                            "guid": "2058c137-ef8e-402d-bf07-766b7e2a41ed",
                            "type": "BASE"
                          }
                        ]
                      }
                    ],
                    "meta": {
                      "next_link": "/api/v1/practices?is_active.equals=true&cursor.equals=bbb271c9-5a87-4a1c-82e7-fd5e971f3861",
                      "per_page": 100,
                      "limit": 100,
                      "remaining_pages": 1
                    }
                  }
                """;
    }

    @GetMapping(value = "/api/v1/users")
    public String users() {
        return """
                {
                              "data": [
                                
                                
                                {
                                  "login": "olitvinova",
                                  "league_guid": "014b4092-9cf7-4782-827c-fab3fff64505",
                                  "is_active": true,
                                  "external": [
                                    {
                                      "id": "30252",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "978685",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Литвинова",
                                  "first_name": "Оксана",
                                  "second_name": "Валериевна",
                                  "previous_last_name": null,
                                  "birthday": "1968-07-10",
                                  "corp_email": "olitvinova@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79163400783",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "79163400783",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2020-01-09",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "10db4553-21a5-4648-824e-27bd77a8bbbc",
                                      "is_active": true,
                                      "company_league_guid": "c78fe85c-c4b9-4065-99c4-11cc0952296c",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2020-01-09",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "f2192cf8-2f66-4fd1-b79f-50914093e777"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.5"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Старший консультант"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000316"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "ipaseka",
                                  "league_guid": "01503701-3098-4736-b498-483b0834f494",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "30840",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "983504",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Пасека",
                                  "first_name": "Илья",
                                  "second_name": "Андреевич",
                                  "previous_last_name": null,
                                  "birthday": "1998-06-10",
                                  "corp_email": "ipaseka@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79160703653",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2020-06-10",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "d344ba28-b24b-4dac-8e11-9928d9307d1a",
                                      "is_active": false,
                                      "company_league_guid": "2042b324-72c1-4061-87f9-0e7071b79df4",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2020-06-10",
                                      "fire_date": "2020-10-22",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Младший аналитик"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000162"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "4e4f23a4-e22d-413a-86ad-fc81268fc534"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "tisaykina",
                                  "league_guid": "015540e7-bd07-47bc-8d2c-5d8c62e3cd09",
                                  "is_active": true,
                                  "external": [
                                    {
                                      "id": "36401",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "1003557",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Исайкина",
                                  "first_name": "Татьяна",
                                  "second_name": "Юрьевна",
                                  "previous_last_name": null,
                                  "birthday": "1999-07-31",
                                  "corp_email": "tisaykina@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79081467335",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2022-11-24",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "7d8b83f5-6109-4643-89a0-6c40bf95f47b",
                                      "is_active": true,
                                      "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2022-11-24",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000006435"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Младший специалист по тестированию"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "95a931c2-719e-4cd7-a935-78f27fba6a90"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "419343b1-2c2b-47bc-98dd-ca2f5f152804"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "old_ngorokhov",
                                  "league_guid": "01599a17-82fe-4cca-9259-82f1ec283fab",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "350744",
                                      "system": "DL"
                                    },
                                    {
                                      "id": "24135",
                                      "system": "PHN"
                                    }
                                  ],
                                  "last_name": "Горохов",
                                  "first_name": "Никита",
                                  "second_name": "Сергеевич",
                                  "previous_last_name": null,
                                  "birthday": "1995-10-06",
                                  "corp_email": "old_ngorokhov@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79031270155",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2017-05-19",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "86aa6afe-e47d-42ae-810b-c2c5183795ca",
                                      "is_active": false,
                                      "company_league_guid": "005c5451-605a-4045-87d8-9d38f7757efe",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-05-19",
                                      "fire_date": "2017-07-31",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "6e33dc2f-b902-4f37-b332-f0d2ffc17053"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Аналитик"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.8"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "mangelova",
                                  "league_guid": "016c4daa-cc6c-451d-acaf-b8b05d690bce",
                                  "is_active": true,
                                  "external": [
                                    {
                                      "id": "24000",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "658",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Ангелова",
                                  "first_name": "Медея",
                                  "second_name": "Гераклитовна",
                                  "previous_last_name": "Пасенова",
                                  "birthday": "1983-03-07",
                                  "corp_email": "mangelova@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79646263102",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "79646263102",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2011-10-05",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "0102a6ca-bee3-4d24-aea9-4d491ec3e44e",
                                      "is_active": true,
                                      "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2018-10-05",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000340"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "b39c0e12-2e92-4d0f-ad20-27175720d030"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Руководитель практики"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "8c4cc6a2-c2be-476b-8793-8bd1848afdd8",
                                      "is_active": false,
                                      "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-10-06",
                                      "fire_date": "2018-10-04",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "b39c0e12-2e92-4d0f-ad20-27175720d030"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Руководитель практики"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "56759a4f-ef19-11e0-88ff-0025900aad67",
                                      "is_active": false,
                                      "company_league_guid": "005c5451-605a-4045-87d8-9d38f7757efe",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-05-15",
                                      "fire_date": "2017-10-05",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "82118f4a-edd5-4ece-b9da-4beb738dd16c"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Руководитель группы"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "adenk",
                                  "league_guid": "01733f6c-f974-48c8-9008-85c2352c79ad",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "986967",
                                      "system": "DL"
                                    },
                                    {
                                      "id": "23489",
                                      "system": "PHN"
                                    }
                                  ],
                                  "last_name": "Денк",
                                  "first_name": "Андрей",
                                  "second_name": "Владимирович",
                                  "previous_last_name": null,
                                  "birthday": "1996-09-18",
                                  "corp_email": "adenk@phoenixit.ru",
                                  "contact_info": [],
                                  "league_position": null,
                                  "first_hire_date": "2016-11-16",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "7bef78b8-cde1-11e6-81a6-1c497b5f976d",
                                      "is_active": false,
                                      "company_league_guid": "bbbecd1c-9ff0-4a8e-a44c-67dd8a07852d",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2016-11-16",
                                      "fire_date": "2017-01-16",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Юрист"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "epulina",
                                  "league_guid": "01736e9c-69d3-4755-850b-503219b05f14",
                                  "is_active": true,
                                  "external": [
                                    {
                                      "id": "25305",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "1614",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Пулина",
                                  "first_name": "Елена",
                                  "second_name": "Викторовна",
                                  "previous_last_name": "Садовская",
                                  "birthday": "1978-12-13",
                                  "corp_email": "epulina@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79036873151",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "epulina@fil-it.ru",
                                      "type": "EMAIL",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "alenkapulina",
                                      "type": "MESSENGER",
                                      "subtype": "TELEGRAM"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2015-06-15",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "2c478155-69ab-4b79-99e0-932965501736",
                                      "is_active": false,
                                      "company_league_guid": "8aa7b504-c837-442b-a1c5-60c1a973d290",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-04-10",
                                      "fire_date": "2017-11-20",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "29910ed0-3401-489f-acf8-91fb146f00ab"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Менеджер"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "c13b4b9a-87ff-4239-914f-de8241bfc591",
                                      "is_active": true,
                                      "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2019-06-27",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "PRACTICE",
                                          "value": "887338d4-4458-4b5c-9511-630041a97b3b"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Старший менеджер"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.5"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "00000374/1"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "79c2c877-02e5-449e-b051-2a92d5718f86",
                                      "is_active": false,
                                      "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-11-21",
                                      "fire_date": "2019-06-26",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "PRACTICE",
                                          "value": "887338d4-4458-4b5c-9511-630041a97b3b"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Старший менеджер"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "yademidova",
                                  "league_guid": "01750b93-93ee-446b-9e62-bfe907552680",
                                  "is_active": true,
                                  "external": [
                                    {
                                      "id": "32645",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "993491",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Демидова",
                                  "first_name": "Яна",
                                  "second_name": "Валентиновна",
                                  "previous_last_name": null,
                                  "birthday": "1986-08-10",
                                  "corp_email": "yademidova@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79611948867",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2021-05-19",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "c7098f29-ab1d-4b1c-8480-41ac11b930d7",
                                      "is_active": true,
                                      "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2021-05-19",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000008218"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.5"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Администратор"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "4266e393-469e-49ae-9197-a7ec4ac89898"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "801e0f55-54c8-44fe-949d-3d25baf031ba"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "d530fccd-73c0-4fcc-8d18-06b6b64da948",
                                      "is_active": true,
                                      "company_league_guid": "c78fe85c-c4b9-4065-99c4-11cc0952296c",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2022-06-30",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "OFFICE",
                                          "value": "4266e393-469e-49ae-9197-a7ec4ac89898"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.5"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "801e0f55-54c8-44fe-949d-3d25baf031ba"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000568"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "EE"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Администратор"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "ekarimov",
                                  "league_guid": "0182396a-58ca-45f3-8392-1b6f47a3c9fc",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "985163",
                                      "system": "DL"
                                    },
                                    {
                                      "id": "31179",
                                      "system": "PHN"
                                    }
                                  ],
                                  "last_name": "Каримов",
                                  "first_name": "Эльдар",
                                  "second_name": "Омарович",
                                  "previous_last_name": null,
                                  "birthday": "1999-06-17",
                                  "corp_email": "ekarimov@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79253620458",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "79253620458",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2020-08-06",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "3259d68a-18b8-4798-909f-bbd195c04d5b",
                                      "is_active": false,
                                      "company_league_guid": "c78fe85c-c4b9-4065-99c4-11cc0952296c",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2020-08-26",
                                      "fire_date": "2020-11-26",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "POSITION",
                                          "value": "Специалист"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "3d1f1511-f5eb-4579-8f4b-aba22979185d"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000326"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "EE"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.1"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "883d5493-780d-4e93-b8e1-5b92f08d0139",
                                      "is_active": false,
                                      "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2020-08-06",
                                      "fire_date": "2021-11-08",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "PRACTICE",
                                          "value": "92296baf-e23e-4445-ad8c-956394c525c9"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000002773"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Стажер"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "smitchenko",
                                  "league_guid": "0185b87d-2c9d-4d6d-a93e-62520b8469ce",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "795",
                                      "system": "DL"
                                    },
                                    {
                                      "id": "24191",
                                      "system": "PHN"
                                    }
                                  ],
                                  "last_name": "Митченко",
                                  "first_name": "Светлана",
                                  "second_name": "Геннадиевна",
                                  "previous_last_name": null,
                                  "birthday": "1983-12-05",
                                  "corp_email": "smitchenko@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79646263504",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "79165221085",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2017-05-25",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "22fd314a-1358-11e0-abc0-0026c6287ed0",
                                      "is_active": false,
                                      "company_league_guid": "005c5451-605a-4045-87d8-9d38f7757efe",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-05-25",
                                      "fire_date": "2019-01-23",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "POSITION",
                                          "value": "Руководитель группы"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "708f338b-3b64-4823-8c78-f1c10e6547a9"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.6"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "6f960f34-899c-4eb4-876f-2823ad29c185",
                                      "is_active": false,
                                      "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2018-06-07",
                                      "fire_date": "2019-01-23",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "EE"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "708f338b-3b64-4823-8c78-f1c10e6547a9"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Специалист"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "e2e3af77-8c7e-4cf5-90c1-701dabb032aa"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.1"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "ikamyshanskaya",
                                  "league_guid": "01892520-2198-48de-9f02-290dfebba2d0",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "32414",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "992650",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Камышанская",
                                  "first_name": "Ирина",
                                  "second_name": "Александровна",
                                  "previous_last_name": null,
                                  "birthday": "1984-07-30",
                                  "corp_email": "ikamyshanskaya@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79636988570",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "79065656446",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2021-04-13",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "6a4cce73-1b03-4928-8bd1-24c32fc34ed1",
                                      "is_active": false,
                                      "company_league_guid": "beae5921-7394-4700-acd9-c14a18a649d3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2021-04-13",
                                      "fire_date": "2022-04-19",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Бухгалтер"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000084"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "419343b1-2c2b-47bc-98dd-ca2f5f152804"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "47fda264-36dc-4d7f-89d8-09672aa3274d"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "vechin",
                                  "league_guid": "018952df-cf8f-41ca-8bb3-c300b2f16a5e",
                                  "is_active": true,
                                  "external": [
                                    {
                                      "id": "24980",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "1372",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Ечин",
                                  "first_name": "Виктор",
                                  "second_name": "Владимирович",
                                  "previous_last_name": null,
                                  "birthday": "1979-07-31",
                                  "corp_email": "vechin@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79029144646",
                                      "type": "PHONE",
                                      "subtype": "CORPORATE"
                                    },
                                    {
                                      "value": "79029144646",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2013-12-19",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "f87aa922-aad9-4472-9e92-02bd0df4646d",
                                      "is_active": true,
                                      "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2013-12-19",
                                      "fire_date": null,
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "OFFICE",
                                          "value": "a0763db7-8312-42b4-9b4f-963304a9bc06"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000003029"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Руководитель проектов"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "791a8010-8f80-4f3c-9cd3-fe2f4bd73958"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "deba88af-831b-48ad-8c8e-21dc58df8c0f",
                                      "is_active": false,
                                      "company_league_guid": "81b685f1-a7f5-43ea-b78c-efeeed7fb5a3",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2017-09-14",
                                      "fire_date": "2023-01-30",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "000000301."
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Консультант"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "EE"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.1"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "791a8010-8f80-4f3c-9cd3-fe2f4bd73958"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "a0763db7-8312-42b4-9b4f-963304a9bc06"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "agotkin",
                                  "league_guid": "0189a4d0-9854-48ca-a4f7-f180f97e0d5e",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "31090",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "984640",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Готкин",
                                  "first_name": "Алексей",
                                  "second_name": "Андреевич",
                                  "previous_last_name": null,
                                  "birthday": "1994-07-01",
                                  "corp_email": "agotkin@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79622595509",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2020-07-21",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "356bcfab-ad9c-4c34-8033-e96147e77785",
                                      "is_active": false,
                                      "company_league_guid": "6232567a-bd06-482d-9a9e-cec60094d8ec",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2020-10-14",
                                      "fire_date": "2021-02-26",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "EE"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "23c7cf82-5ccd-4d07-8cba-69bf23ca9e99"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000000064"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Старший бизнес-аналитик"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.1"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "3cea3a48-ae6d-495a-a213-62dd494e016e"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "be142f94-5bf8-4ffa-8380-594a1bb60029",
                                      "is_active": false,
                                      "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2020-07-21",
                                      "fire_date": "2021-02-26",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "PRACTICE",
                                          "value": "3cea3a48-ae6d-495a-a213-62dd494e016e"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "23c7cf82-5ccd-4d07-8cba-69bf23ca9e99"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "TAB_NUMBER",
                                          "value": "0000007754"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "0.9"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Старший бизнес-аналитик"
                                        }
                                      ]
                                    }
                                  ]
                                },
                                {
                                  "login": "ashustov",
                                  "league_guid": "01f07560-8035-406b-a05c-b9bf1bc7a821",
                                  "is_active": false,
                                  "external": [
                                    {
                                      "id": "26215",
                                      "system": "PHN"
                                    },
                                    {
                                      "id": "987619",
                                      "system": "DL"
                                    }
                                  ],
                                  "last_name": "Шустов",
                                  "first_name": "Александр",
                                  "second_name": "Владимирович",
                                  "previous_last_name": null,
                                  "birthday": "1977-01-02",
                                  "corp_email": "ashustov@phoenixit.ru",
                                  "contact_info": [
                                    {
                                      "value": "79102821908",
                                      "type": "PHONE",
                                      "subtype": "PERSONAL"
                                    }
                                  ],
                                  "league_position": null,
                                  "first_hire_date": "2016-08-23",
                                  "gender": null,
                                  "additional_work_status": null,
                                  "work_conditions": [
                                    {
                                      "wc_1с_guid": "59b43b2a-095b-4c0b-8fcd-957386ca0e80",
                                      "is_active": false,
                                      "company_league_guid": "f21744b1-5522-4035-8fbd-b5c5d476e934",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2016-08-23",
                                      "fire_date": "2018-10-22",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "BE"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "791a8010-8f80-4f3c-9cd3-fe2f4bd73958"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Ведущий эксперт"
                                        },
                                        {
                                          "type": "RATE",
                                          "value": "1"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "419343b1-2c2b-47bc-98dd-ca2f5f152804"
                                        }
                                      ]
                                    },
                                    {
                                      "wc_1с_guid": "1e80220b-2979-4b33-83f1-7637d42bf09f",
                                      "is_active": false,
                                      "company_league_guid": "c78fe85c-c4b9-4065-99c4-11cc0952296c",
                                      "wc_1с_employee_guid": null,
                                      "hire_date": "2018-03-01",
                                      "fire_date": "2018-10-22",
                                      "secret_access": false,
                                      "attributes": [
                                        {
                                          "type": "RATE",
                                          "value": "0.1"
                                        },
                                        {
                                          "type": "POSITION",
                                          "value": "Специалист"
                                        },
                                        {
                                          "type": "OFFICE",
                                          "value": "419343b1-2c2b-47bc-98dd-ca2f5f152804"
                                        },
                                        {
                                          "type": "EMPLOYMENT_TYPE",
                                          "value": "EE"
                                        },
                                        {
                                          "type": "PRACTICE",
                                          "value": "791a8010-8f80-4f3c-9cd3-fe2f4bd73958"
                                        }
                                      ]
                                    }
                                  ]
                                }
                              ],
                              "meta": {
                                "next_link": "/api/v1/employees?_limit=100&cursor.equals=01f07560-8035-406b-a05c-b9bf1bc7a821",
                                "per_page": 100,
                                "limit": 100,
                                "remaining_pages": 131
                              }
                            }
                """;
    }

    @PostMapping("/employee")
    public ResponseEntity<Object> employee(@RequestBody final List<EmployeeRequestDTO> requestDTO) {
        System.out.println(requestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/company")
    public ResponseEntity<Object> company(@RequestBody final List<CompanyRequestDTO> requestDTO) {
        System.out.println(requestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/office")
    public ResponseEntity<Object> office(@RequestBody final List<OfficeRequestDTO> requestDTO) {
        System.out.println(requestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/practice")
    public ResponseEntity<Object> practice(@RequestBody final List<PracticeRequestDTO> requestDTO) {
        System.out.println(requestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<Object> user(@RequestBody final List<UserRequestDTO> requestDTO) {
        System.out.println(requestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}