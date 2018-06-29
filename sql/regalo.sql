set names utf8;
set foreign_key_checks=0;

drop database if exists Regalo;
create database if not exists Regalo;

use Regalo;


/*-----------------会員情報-------------------*/

create table user_info(

id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint not null default 0 comment "性別",
email varchar(32) not null comment "メールアドレス",
status tinyint not null default 0 comment "ステータス",
total_price int default 0 comment "累計購入金額",
rank int default 0 comment "会員ランク",
logined tinyint not null default 0 comment "ログインフラグ",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)

default charset=utf8
comment="会員情報テーブル";

insert into user_info values
(1,"guest","guest","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(2,"admin","admin","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(3,"guest2","guest2","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,1,0,now(),now()),
(4,"guest3","guest3","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(5,"guest4","guest4","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(6,"guest5","guest5","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(7,"guest6","guest6","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(8,"guest7","guest7","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(9,"guest8","guest8","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(10,"guest9","guest9","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(11,"guest10","guest10","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(12,"guest11","guest11","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(13,"guest12","guest12","ゲスト","ユーザー","げすと","ゆーざー",0,"guest@gmail.com",0,0,0,0,now(),now()),
(14,"admin3","admin3","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(15,"admin4","admin4","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(16,"admin5","admin5","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(17,"admin6","admin6","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(18,"admin7","admin7","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(19,"admin8","admin8","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(20,"admin9","admin9","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(21,"admin10","admin10","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(22,"admin11","admin11","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(23,"admin12","admin12","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now()),
(24,"admin2","admin2","管理","管理","かんり","かんり",0,"admin@gmail.com",0,0,0,0,now(),now());




/*-----------------商品情報-------------------*/

create table product_info(

id int primary key not null auto_increment comment "ID",
product_id int unique not null comment "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(255) not null comment"商品詳細",
category_id int not null not null comment "カテゴリID",
price int comment "価格",
product_stock int comment "在庫",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint not null default 0 comment "ステータス",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references m_category(category_id)
)
default charset=utf8
comment="商品情報テーブル";

insert into product_info values
(1,1,"VITTAMER","びためーる","ベルギー王室御用達のチョコレートブランド。",2,13000,50,"./images","choco1.jpg",now(),"Regalo",0,now(),now()),
(2,2,"Lindt","りんつ","パリで創業した老舗の高級ブランド。ジュエリーのような可愛らしい見た目が特徴的。",2,12000,15,"./images","choco6.jpg",now(),"Regalo",0,now(),now()),
(3,3,"fabrice","ふぁぶりす","ドライフルーツや洋酒を混ぜて作られているものなど種類豊富なチョコレートが取り揃えられています。",2,13000,15,"./images","choco2.jpg",now(),"Regalo",0,now(),now()),
(4,4,"DEMEL","でめる","パリ発祥であるDEMELのチョコレートは、チョコ自体もボックスもとてもお洒落です。",2,12000,15,"./images","choco5.jpg",now(),"Regalo",0,now(),now()),
(5,5,"cluster","くらすたー","完璧なプロポーションを備え最大限の輝きを放つダイヤモンド",4,85000,15,"./images","accessories.jpg",now(),"Regalo",0,now(),now()),
(6,6,"harrywinston","はりーうぃんすとん","ブランドを最も象徴するシークレットステートメントネックレス",4,90000,15,"./images","accessories3.jpg",now(),"Regalo",0,now(),now()),
(7,7,"lilycluster","りりーくらすたー","流れるような曲線が特徴的な百合の花からインスピレーションを得たジュエリー",4,105000,15,"./images","accessories2.jpg",now(),"Regalo",0,now(),now()),
(8,8,"royaldiamond","ろいやるだいあもんど","百合の花をデザインに取り入れたエレガントなソートワール",4,65000,15,"./images","accessories4.jpg",now(),"Regalo",0,now(),now()),
(9,9,"Ch.Latour","しゃとーらてゅーる","チリ産1950年のヴィンテージ赤ワイン",3,42000,15,"./images","wine4.jpg",now(),"Regalo",0,now(),now()),
(10,10,"Ch.Filhot","しゃとーふぃろー","フランス産1956年ヴィンテージの人気の赤ワイン",3,45000,15,"./images","wine5.jpg",now(),"Regalo",0,now(),now()),
(11,11,"Ch.Daycame","しゃとーでいけむ","世界最高峰の貴腐白ワイン",3,48000,15,"./images","wine6.jpg",now(),"Regalo",0,now(),now()),
(12,12,"Montrachet","もんらっしぇ","フランスブルゴーニュ地方辛口白ワイン",3,65000,15,"./images","wine8.jpg",now(),"Regalo",0,now(),now()),
(13,13,"ララパチアリング","ららぱちありんぐ","産出が極めて少なく幻の宝石と言われております。",4,85000,15,"./images","ring.jpg",now(),"Regalo",1,now(),now()),
(14,14,"プチプリリング","ぷちぷりりんぐ","ルビーの輝きをその周りを囲む小粒のダイヤモンドが引き立てます。",4,250000,15,"./images","ring2.jpg",now(),"Regalo",1,now(),now()),
(15,15,"アンジュールレザーケース","あんじゅーるれざーけーす","ビジネスマンの日常的なニーズに対応する代表モデル。",4,367000,15,"./images","bag1.jpg",now(),"Regalo",1,now(),now()),
(16,16,"アリゲーターレザースーツケース","ありげーたーれざーすーつけーす","最高級アリゲーターレザー使用。",4,485000,15,"./images","bag2.jpg",now(),"Regalo",1,now(),now()),
(17,17,"ブラックレザーウォッチ","ぶらっくれざーうぉっち","文字盤にはブラックシェルが施されたラグジュアリーモデル。",4,335000,15,"./images","watch5.jpg",now(),"Regalo",1,now(),now()),
(18,18,"セラミッククロノペアウォッチ","せらみっくくろのぺあうぉっち","セラミッククロノの人気のペアウォッチ。",4,455000,15,"./images","watchpea2.jpg",now(),"Regalo",1,now(),now());






/*-----------------カート情報-------------------*/

create table cart_info(

id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
temp_user_id varchar(16) comment "仮ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)

default charset=utf8
comment ="カート情報テーブル";




/*-------------------購入履歴情報-------------------*/

create table purchase_history_info(

id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
destination_id int not null comment "宛先情報ID",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日",
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)

default charset=utf8
comment="購入履歴情報テーブル";





/*-----------------宛先情報-------------------*/

create table destination_info(

id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) not null comment "メールアドレス",
tel_number varchar(13) not null comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)


default charset=utf8
comment="宛先情報テーブル";

insert into destination_info values
(1,"guest","ゲスト","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(3,"guest2","ゲスト2","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(4,"guest3","ゲスト3","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(5,"guest4","ゲスト4","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(6,"guest5","ゲスト5","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(7,"guest6","ゲスト6","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(8,"guest7","ゲスト7","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(9,"guest8","ゲスト8","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(10,"guest9","ゲスト9","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(11,"guest10","ゲスト10","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(12,"guest11","ゲスト11","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00"),
(13,"guest12","ゲスト12","ユーザー","げすと","ゆーざー","guest@gmail.com","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00");




/*-----------------カテゴリマスターテーブル-------------------*/

create table m_category(

id int primary key not null comment "ID",
category_id int not null unique comment "カテゴリーID",
category_name varchar(20) not null unique comment "カテゴリ名",
category_description varchar(100) comment "カテゴリ詳細",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)


default charset=utf8
comment="カテゴリマスターテーブル";

insert into m_category values
(1,1,"ALL  ITEM","食料品、雑貨、酒全てのカテゴリーが対象となります",now(),null),
(2,2,"FOOD","食料品に関するカテゴリーが対象となります",now(),null),
(3,3,"WINE","雑貨に関するカテゴリーが対象となります",now(),null),
(4,4,"ACCESSORIES","酒に関するカテゴリーが対象となります",now(),null);




