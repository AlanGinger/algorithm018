学习笔记

数组 Array

- 访问时间快 O（1）
- 插入时间复杂度 O(n）
- 删除时间复杂度 O(n）

链表 Linked List
单链表：只有next指针，最后一个node next指针指向空
双链表：有next和previous指针
循环链表：最后一个node的next指针指向head
- 从头节点增加时间复杂度 O（1）
- 从尾节点增加时间复杂度 O（1）
- 添加节点时间复杂度 O（1）
- 删除节点时间复杂度 O（1）
- 访问节点时间复杂度 O（n）

跳表 Skip List （只适用于元素有序的情况）
- 插入 O（log n)
- 删除 O（log n)
- 搜索 O（log n)
如何加速？ 升维

索引高度： logn, 每层索引遍历的节点个数：3
查询任意数据的时间复杂度是O（logn)
维护成本较高
空间复杂度 O（n）

栈 Stack
- 先入后出
- 添加 O（1）
- 删除 O（1）
- 查找 O（n)

列 Queue
先入先出
- 添加 O（1）
- 删除 O（1）
- 查找 O（n)

双端队列 Deque
- 两端都能进出
- 添加 O（1）
- 删除 O（1）

优先队列 Priority Queue
- 插入 O（1）
- 取出 O（logN） 按元素的优先级取出