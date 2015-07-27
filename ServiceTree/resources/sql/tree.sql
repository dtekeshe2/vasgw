CREATE DATABASE IF NOT EXISTS ebridge_web;

CREATE TABLE IF NOT EXISTS eb_directory
(
    ean_code            VARCHAR(20) NOT NULL,
    short_description   VARCHAR(60) NOT NULL,
    description         VARCHAR(120) NULL,
    PRIMARY KEY         (ean_code)
);
INSERT INTO eb_directory(ean_code, short_description, description)
VALUES
    ('60296110000','eBridge', 'Business Messaging Network'),
    ('60296110001','Telecel', 'Value Added Services'),
    ('60296110002','Soccer Shop', 'Make Money From Betting'),
    ('60296110003','Huawei', 'Shipping Service'),
    ('60296110004','Inter-cape', 'Transport Service'),
    ('60296110005','Greyhound', 'Transport Service'),
    ('60296110006','Pioneer', 'Transport Service'),
    ('60296110007','Go-Liner', 'Transport Service'),
    ('60296110008','Eagle-Liner', 'Transport Service'),
    ('60296110009','MmCellink', 'Mobile Phones'),
    ('60296110010','Chitaitai', 'House Hold Chemicals');

CREATE TABLE IF NOT EXISTS eb_contact
(
    ean_code        VARCHAR(20) NOT NULL,
    service_end_point      INT,
    rank            INT,
    status          VARCHAR(10),
    contact_type    VARCHAR(20),
    contact_number  VARCHAR(20),
    PRIMARY KEY (ean_code, service_end_point)
);
INSERT INTO eb_contact (ean_code, service_end_point, rank, status, contact_type, contact_number)
VALUES
    ('60296110000', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418288'),
    ('60296110001', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418290'),
    ('60296110002', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418291'),
    ('60296110003', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418292'),
    ('60296110004', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418293'),
    ('60296110005', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418294'),
    ('60296110006', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418295'),
    ('60296110007', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418296'),
    ('60296110008', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418297'),
    ('60296110009', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418298'),
    ('60296110010', 1, 1, 'ACTIVE', 'MOBILE_NUMBER', '27721418299');

CREATE TABLE IF NOT EXISTS eb_node
(
    ean_code             VARCHAR(20) NOT NULL,
    supplier_ean_code       VARCHAR(5) NULL,
    parent_ean_code           VARCHAR(20),
    service_end_point            VARCHAR(20),
    is_cacheable        BOOLEAN,
    node_processor_name VARCHAR(255),
    node_data           TEXT,
    PRIMARY KEY         (ean_code)
);

DELETE FROM eb_node;

INSERT INTO eb_node (ean_code,  supplier_ean_code, parent_ean_code, service_end_point, is_cacheable, node_processor_name, node_data)
VALUES
    ('60296110000', null,  NULL,         '27721418288', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110000, parent_ean_code:none,        service_end_point:27721418288, ean_description:eBridge,                     ean_short_description: business messaging network}'),
    ('60296110001', '901', '60296110000', '27721418290', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110001, parent_ean_code:60296110000, service_end_point:27721418290, ean_description:Telecel,                     ean_short_description: value added services}'),
    ('60296110002', '902', '60296110000', '27721418291', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110002, parent_ean_code:60296110000, service_end_point:27721418291, ean_description:Soccer Shop,                 ean_short_description: make money from betting}'),
    ('60296110003', null, '60296110000', '27721418292', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110003, parent_ean_code:60296110000, service_end_point:27721418292, ean_description:Huawei,                      ean_short_description: shipping service}'),
    ('60296110004', null, '60296110000', '27721418293', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110004, parent_ean_code:60296110000, service_end_point:27721418293, ean_description:Inter-cape,                  ean_short_description: transport service}'),
    ('60296110005', null, '60296110000', '27721418294', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110005, parent_ean_code:60296110000, service_end_point:27721418294, ean_description:Greyhound,                   ean_short_description: transport service}'),
    ('60296110006', null, '60296110000', '27721418295', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110006, parent_ean_code:60296110000, service_end_point:27721418295, ean_description:Pioneer,                     ean_short_description: transport service}'),
    ('60296110007', null, '60296110000', '27721418296', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110007, parent_ean_code:60296110000, service_end_point:27721418296, ean_description:Go-Liner,                    ean_short_description: transport service}'),
    ('60296110008', null, '60296110000', '27721418297', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110008, parent_ean_code:60296110000, service_end_point:27721418297, ean_description:Eagle-Liner,                 ean_short_description: transport service}'),
    ('60296110009', null, '60296110000', '27721418298', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110009, parent_ean_code:60296110000, service_end_point:27721418298, ean_description:MmCellink,                   ean_short_description: mobile phones }'),
    ('60296110010', null, '60296110000', '27721418299', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110010, parent_ean_code:60296110000, service_end_point:27721418299, ean_description:Chitaitai,                   ean_short_description: house hold chemicals}'),
    ('60296110022', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110022, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Balances,                    ean_short_description: for prepaid accounts}'),
    ('60296110011', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ChildListing', '{ean_code:60296110011, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Data Bundle Purchase,        ean_short_description: for yours or friend}'),
    ('60296110012', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ProductForm',  '{ean_code:60296110012, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Airtime Transfer,            ean_short_description: to your friends}'),
    ('60296110013', null, '60296110001', '27721418290', 'Y', 'com.ebridge.processors.ProductForm',  '{ean_code:60296110013, parent_ean_code:60296110001, service_end_point:27721418290, ean_description:Voucher Recharge,            ean_short_description: your phone or friends}'),
    ('60296110014', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110014, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:10MB Data Bundle,            ean_short_description: 4.8 MB Data Bundle,      item_price: 0.50, quantity: 4.80, rate: 0.108, debit_amount: 0.50, credit_amount: 0.576, valid_until:30 days'),
    ('60296110015', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110015, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:20MB Data Bundle,            ean_short_description: 9.5 MB Data Bundle,      item_price: 1.00, quantity: 9.50, rate: 0.10, debit_amount: 1.00, credit_amount: 1.14, valid_until:30 days}'),
    ('60296110016', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110016, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:40MB Data Bundle,            ean_short_description: 76 MB Data Bundle,       item_price: 3.00, quantity: 76.00, rate: 0.08, debit_amount: 3.00, credit_amount: 9.12, valid_until:30 days}'),
    ('60296110017', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110017, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:160MB Data Bundle,           ean_short_description: 142.5 MB Data Bundle,    item_price: 5.00, quantity: 142.50, rate: 0.08, debit_amount: 5.00, credit_amount: 17.10, valid_until:30 days}'),
    ('60296110018', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110018, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:300MB Data Bundle,           ean_short_description: 304 MB Data Bundle,      item_price: 10.00, quantity: 304.00, rate: 0.06, debit_amount: 10.00, credit_amount: 36.48, valid_until:30 days}'),
    ('60296110019', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110019, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:1000MB Data Bundle,          ean_short_description: 800 MB Data Bundle,      item_price: 20.00, quantity: 800.00, rate: 0.05, debit_amount: 20.00, credit_amount: 96.00, valid_until:60 days}'),
    ('60296110020', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110020, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:2000MB Data Bundle,          ean_short_description: 2000 MB Data Bundle,     item_price: 45.00, quantity: 2000.00, rate: 0.05, debit_amount: 45.00, credit_amount: 240.00, valid_until:90 days}'),
    ('60296110021', null, '60296110011', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110021, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:4000MB Data Bundle,          ean_short_description: 4000 MB Data Bundle,     item_price: 75.00, quantity: 4000.00, rate: 0.04, debit_amount: 75.00, credit_amount: 480.00, valid_until:120 days}'),
    ('60296110023', null, '60296110022', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110023, parent_ean_code:60296110022, service_end_point:27721418290, ean_description:Main Account,                ean_short_description: Airtime,                 ean_supplier_code: Core,          unit_of_measure: money, normalization_factor: 1.00, index: 1, payload_size: summary}'),
    ('60296110024', null, '60296110022', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110024, parent_ean_code:60296110022, service_end_point:27721418290, ean_description:Internet Browsing Wallet,    ean_short_description: Data Account,            ean_supplier_code: Gprs_bundle,   unit_of_measure: data,  normalization_factor: 0.12, index: 2, payload_size: summary}'),
    ('60296110025', null, '60296110022', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110025, parent_ean_code:60296110022, service_end_point:27721418290, ean_description:Facebook,                    ean_short_description: Facebook,                ean_supplier_code: facebook,      unit_of_measure: data,  normalization_factor: 1.00, index: 3, payload_size: detail}'),
    ('60296110026', null, '60296110022', '27721418290', 'Y', 'com.ebridge.processors.SaleCapture',  '{ean_code:60296110026, parent_ean_code:60296110022, service_end_point:27721418290, ean_description:Whatsapp,                    ean_short_description: Whatsapp,                ean_supplier_Code: whatsapp,      unit_of_measure: data,  normalization_factor: 1.00, index: 4, payload_size: detail}'),
    ('60296110027', null, '60296110012', '27721418290', 'Y', 'com.ebridge.processors.BalanceTransfer',  '{"eanCode":"60296110027","parentEanCode":"60296110012","sourceEndPoint":"27729745087","serviceEndPoint":"27721418290","eanDescription":"Airtime Transfer","eanShortDescription":"Airtime Transfer","parameters":[{"index":1,"name":"sourceMobileNumber","label":"Your mobile number","type":"mobileNumber"},{"index":2,"name":"beneficiaryMobileNumber","label":"Your friend\u0027s number","type":"mobileNumber"},{"index":3,"name":"balanceTransferAmount","label":"Amount to transfer","type":"money","min":1.00,"max":100.00}]}'),
    ('60296110028', null, '60296110013', '27721418290', 'Y', 'com.ebridge.processors.BalanceTransfer',  '{ean_code:60296110028, parent_ean_code:60296110013, service_end_point:27721418290, ean_description:Voucher Recharge,        ean_short_description: Voucher Recharge,        params : [{index: 1, name : recharge_voucher, label: Voucher Number, type: recharge_voucher, valid_lengths: 12|16},{index: 2, name : beneficiary_mobile_number, label: Your Friend\'s Number, type: mobile_number}  }');




