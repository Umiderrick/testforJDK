# testforJDK

SOME REVIEW FOR MYSQL B+ B B* Index

B+Tree的特性

(1)由图能看出，单节点能存储更多数据，使得磁盘IO次数更少。
(2)叶子节点形成有序链表，便于执行范围操作。
(3)聚集索引中，叶子节点的data直接包含数据；非聚集索引中，叶子节点存储数据地址的指针。

 　　
