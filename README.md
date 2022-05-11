 # Матеј Љушев 195100
# Control Flow Graph
![Control Flow Graph NEW Lab2](https://user-images.githubusercontent.com/59237104/167705608-d8f00cb3-2149-4347-87d1-3b7e70ee75ee.png)
# Цикломатска Комплексност
Цикломатската комплексност на овој код ја добив според формулата =  Бројот на Ребра - Бројот на Јазли + 2 
,каде бројот на ребра се стрелките додека бројот на јазли се самите јазли (1,2..22)
(30 - 23 + 2) = 9, или со броење на регионите од CFG, повторно може да се види дека бројот на региони е 9.
# Еvery Statement 
За оваа функција минимум ни се потребни 3 теста.
1) Со првиот тест кога големината на листата е 0 ги покриваме овие statements: 1, 2 и 22.
2) Со вториот тест кога големината на листата е 2 ги покриваме oвие statements: 1, 3, 4, 5, 6 и 22.
3) Со третиот тест кога големината на листата е 16 ги покриваме овие statements: 1, 3, 4, 5, 7, 8.1, 8.2, 8.3, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 и 22. 
 
 Input за Третиот тест:

        list.add("@#");
        list.add("#");                           
        list.add("#");                        
        list.add("#");
        list.add("#@");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("@#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#@");
        list.add("@");
        list.add("@");
        
   # Every Branch
   Истите тестови кои ги искористивме за да го поминеме секој израз, ќе бидат доволно и за секоја патека.
   
   Патеките се:
   
                 1-2          
                 2-22        
                 1-3,4  
                 3,4-5  
                 5-6     
                 6-22   
                 5-7    
                 7-8.1
                 8.1-8.2
                 8.2-9
                 9-10
                 9-20
                 10-11
                 11-15
                 11-12
                 12-14
                 12-13
                 14-15
                 13-15
                 15-16
                 15-17
                 16-17
                 17-18
                 17-19
                 18-19
                 19-8.3
                 20-8.3
                 8.3-8.2
                 8.2-21
                 21-22
                 
  1) Првиот тест е кога големината на листата е 0 и патеките кои ги покрива се: 1-2 и 2-22
  2) Вториот тест е кога големината на листата е 2 и патеките кои ги покрива се: 1-3,4, 3,4-5, 5-6 и 6-22.
  3) Третиот тест е кога големината на листата е 16 и патеките кои ги покрива се: 1-3,4, 3,4-5, 5-7, 7-8.1, 8.1-8.2,  8.2-9, 9-10, 9-20, 
  10-11, 11-15, 11-12, 12-14, 12-13, 14-15, 13-15, 15-16,  15-17,  16-17,  17-18, 17-19,  18-19,  19-8.3, 20-8.3, 8.3-8.2, 8.2-21 и 21-22.
  
                
                 
                 
                 
                
                 
                 
                
                
                
                 
                 
               
                 
                 
                
                 
                
                 
                 
                
                
