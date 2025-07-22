for i in range (10):
    if i%2 ==0:
        continue
    print(i)
    # contine salta valores en este caso salta los numeros par

for i in range(10):
    if i==5:
        break
    print(i)
    # break corta el loop


for i in range(10):
    if i==7:
        continue
    print(i)
    # continue salta el 7 


#syntax while

#while condition:
    #code block
    
#count down from 5
count = 5 
while count > 0:
    print(count)
    count -=1
    
print("Outside while Loop")


#Syntax for for-loop

# for item in sequence:
#     code block

#Loop through a list 
fruits = ["apple","banana","cherry"]
for fruit in fruits:
    print(fruit)
    
## Loop with range

for i in range(5):
    print(i)

#Ejemplo 1 Checking a condition 
num = 0

if num > 0:
   print("Positive Number")
elif num == 0:
    print("Zero")  
#else:
    print("Negative Number")
    
# #Ejemplo 2 Nested Conditions -- Condiciones anidadas 
age = 32

if age > 18:
    if age < 30:
        print("Young Adult")
    else:
        print("Adult")    
    