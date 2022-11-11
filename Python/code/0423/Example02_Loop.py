# Example02_Loop.py

# 10 <= n < 30 사이의 값들을 출력 
n = 10
while n < 30 :
    print(f'n : {n}')
    n += 1

print('-'*50)
# 정수 n 을 입력을 받아서
# 'Hello Python' 을 n 번 출력
# MAX = int(input('Enter an integer >>> '))
MAX = 0
count = 0 

while count < MAX : 
    print('Hello Python!')
    count+=1

print('-'*50)

# 정수 0 을 입력 받을 때 까지 
# 입력받은 모든 정수들의 합을 구해서 출력

# k = int(input('enter an integer(exit is 0) >>> ')) # 입력받은 정수를 저장할 변수
# total = 0
# while k != 0 :
#     # 변수 total 의 값을 k 만큼 증가
#     total += k
#     k = int(input('enter an integer(exit is 0) >>> '))

k = 1
total = 0
while k != 0 :
    k = int(input('enter an integer(exit is 0) >>> '))
    total += k # 0 더해지더라도 total 의 값은 변화가 없다.
    
print(f'total = {total}')
print('-'*50)