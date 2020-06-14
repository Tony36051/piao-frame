# 商品中心
## 表结构
product_brand
```sql
drop table product_brand;
create table if not exists product_brand(
    id serial primary key,
    name text NOT NULL,
	logo_url text not null,
	sort_id smallint default 999 not null,
	status smallint not null
);
comment on table product_brand is '品牌表';
comment on column product_brand.logo_url is 'logo图标存储的路径';
comment on column product_brand.sort_id is '品牌列表返回排序号';
comment on column product_brand.status is '0:停用,1:启用';
```

product_category_b
```sql
create table if not exists product_category_b(
    id serial primary key,
    name text not null,
    pid int not null,
    sort_id smallint default 999 not null,
    status smallint not null
);
comment on table product_category_b is '后台类目表';
comment on column product_category_b.pid is '父分类id，-1表示顶级目录';
comment on column product_category_b.sort_id is '排序号';
comment on column product_category_b.status is '0:停用,1:启用';
```

product_category_f
```sql
create table if not exists product_category_f(
    id serial primary key,
    name text not null,
    pid int not null,
    sort_id smallint default 999 not null,
    status smallint not null
);
comment on table product_category_f is '前台类目表';
comment on column product_category_f.pid is '父分类id，-1表示顶级目录';
comment on column product_category_f.sort_id is '排序号';
comment on column product_category_f.status is '0:停用,1:启用';
```

product_category_r
```sql
create table if not exists product_category_r(
    fid int not null,
    bid int not null,
);
comment on table product_category_r is '前后台类目关系表，多对多';
comment on column product_category_r.fid is '前台类目id';
comment on column product_category_r.bid is '后台类目id';
```

