# homeWork16

1 задача:
Создать класс студента. Определить поля возраст (int), индификационный номер (long), успеваемость (short),
имя и фамилию. Переопредеить без генерации методы equals, hashcode, toString.

2 задача:
Создать класс: Товар, Цветок, Аксесуар.
Букет (товар): состоит из аксесуаров и цветов. Количество одинаковых цветов и аксессуаров в букете не должно превышать 
трех. Выбрасывать исключение, если такая ситуация получается. Определить для всех классов методы: equals, hashcode, toString.
Поля для товара: наименование, стоимость. 
Поля для цветка: наименование, длина стебля, количество бутонов, цвет бутонов. 
Поля для класса аксессуар: материал (к примеру дерево), тип (игрушка, опора). Добавить метод по сборке цветов.
Получить цену собранного букета. Вывести информацию в консоль

3 задача:
Магазин новогодних подарков. Класс новогодних подарков пусть будет абстрактным.
Создать классы, которые наследуються от класса "Товар", а именно: "Конфета", "Детская игрушка", "Парфимерия".
Поля для класса Товар: цена, скидка, наименование, вес. 
Поля для класса Конфетка: тип (enum: шоколадная, вафельная, карамель), бренд, объем, срок годности.
Поля для класса "Детская игрушка": тип(enum: мягкая, твердая), описание
Определить для всех классов методы equals, hashcode, toString.

Создать класс новогодний подарок, который будет состоять из нескольких уникальных конфет, паре уникальных детских игрушек
и из одного товара из раздела парфюмерия. 
Создать метод по комплектации новогоднего подарка (2 конфеты, 2 игрушки). При этом выполнить проверку, что бы конфеты и 
игрушки были уникальными. Если не уникальны, то выбросить свое исключение
Посчитать вес новогоднего подарка. Создать для этого метод.