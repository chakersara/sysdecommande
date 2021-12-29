# customers
insert into customers value (1,true,'address','customer1');
insert into customers value (2,true,'address','customer2');
insert into customers value (3,true,'address','customer3');
insert into customers value (4,true,'address','customer4');
insert into customers value (5,true,'address','customer5');
insert into customers value (6,true,'address','customer6');
insert into customers value (7,true,'address','customer7');
insert into customers value (8,true,'address','customer8');
insert into customers value (9,true,'address','customer9');
insert into customers value (10,true,'address','customer10');

#item
insert into item value (1,'item1',26,2);
insert into item value (2,'item2',4,1);
insert into item value (3,'item3',8,10);
insert into item value (4,'item4',40,30);
insert into item value (5,'item5',50,8);
insert into item value (6,'item6',60,6);
insert into item value (7,'item7',6,3);
insert into item value (8,'item8',5,2);
insert into item value (9,'item9',11,7);
insert into item value (10,'item10',14,11);

#order
insert into order_status value(1,curdate(),'pending',1);
insert into order_status value(2,curdate(),'pending',1);
insert into order_status value(3,curdate(),'pending',2);
insert into order_status value(4,curdate(),'pending',3);
insert into order_status value(5,curdate(),'pending',3);
insert into order_status value(6,curdate(),'pending',4);
insert into order_status value(7,curdate(),'pending',4);
insert into order_status value(8,curdate(),'pending',5);
insert into order_status value(9,curdate(),'pending',6);
insert into order_status value(10,curdate(),'pending',6);
insert into order_status value(11,curdate(),'pending',6);
insert into order_status value(12,curdate(),'pending',7);
insert into order_status value(13,curdate(),'pending',7);
insert into order_status value(14,curdate(),'pending',8);
insert into order_status value(15,curdate(),'pending',8);
insert into order_status value(16,curdate(),'pending',9);
insert into order_status value(17,curdate(),'pending',9);
insert into order_status value(18,curdate(),'pending',9);
insert into order_status value(19,curdate(),'pending',10);

update order_status set order_status='SHIPPING';

#delivery
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(1,curdate(),date_add(curdate(),interval 12 day),'hamma',1);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(2,curdate(),date_add(curdate(),interval 5 day),'salah',1);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(3,curdate(),date_add(curdate(),interval 7 day),'hamma',2);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(4,curdate(),date_add(curdate(),interval 4 day),'salah',3);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(5,curdate(),date_add(curdate(),interval 6 day),'sabry',3);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(6,curdate(),date_add(curdate(),interval 9 day),'sabry',4);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(7,curdate(),date_add(curdate(),interval 5 day),'salah',4);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(8,curdate(),date_add(curdate(),interval 8 day),'salah',5);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(9,curdate(),date_add(curdate(),interval 3 day),'hamma',6);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(10,curdate(),date_add(curdate(),interval 12 day),'salah',6);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(11,curdate(),date_add(curdate(),interval 14 day),'sabry',6);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(12,curdate(),date_add(curdate(),interval 6 day),'sabry',7);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(13,curdate(),date_add(curdate(),interval 4 day),'salah',7);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(14,curdate(),date_add(curdate(),interval 15 day),'hamma',8);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(15,curdate(),date_add(curdate(),interval 4 day),'sabry',8);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(16,curdate(),date_add(curdate(),interval 6 day),'sabry',9);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(17,curdate(),date_add(curdate(),interval 4 day),'hamma',9);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(18,curdate(),date_add(curdate(),interval 3 day),'salah',9);
insert into delivery(id,shopping_date,delivery_date,delivery_man,order_id)
 value(19,curdate(),date_add(curdate(),interval 7 day),'salah',10);


#order_detail
insert into order_detail value (1,3,4,1,1);
insert into order_detail value (2,1,5,2,2);
insert into order_detail value (3,4,4,3,3);
insert into order_detail value (4,9,6,4,4);
insert into order_detail value (5,12,4,5,5);
insert into order_detail value (6,5,8,6,6);
insert into order_detail value (7,7,4,7,7);
insert into order_detail value (8,2,4,8,8);
insert into order_detail value (9,5,4,9,9);
insert into order_detail value (10,3,4,9,10);
insert into order_detail value (11,3,4,8,11);
insert into order_detail value (12,7,4,7,12);
insert into order_detail value (13,1,4,6,13);
insert into order_detail value (14,2,3,6,14);
insert into order_detail value (15,5,4,6,15);
insert into order_detail value (16,9,4,5,16);
insert into order_detail value (17,30,9,4,17);
insert into order_detail value (18,20,4,3,18);
insert into order_detail value (19,4,4,2,19);
insert into order_detail value (20,5,2,5,1);
insert into order_detail value (21,6,4,9,14);
insert into order_detail value (22,8,2,1,15);
insert into order_detail value (23,1,4,2,2);
insert into order_detail value (24,2,6,3,7);
insert into order_detail value (25,3,4,8,9);
