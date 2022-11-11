# File01_LoopStatement.py

# 반복문(Loop Statement)
#  - 코드를 반복 수행하기 위한 제어문
#  - 특정 코드를 반복하기 때문에 흐름이 다시 위로 올라가서 반복한다.
#  - 종류
#       - while 문
#           : 조건에 의해 반복 수행하는 반복문
#           : ~ 할 때 까지, ~ 만족 하는 동안
#       - for 문
#           : 데이터(또는 스퀀스객체)에 의해 반복 수행하는 반복문
#           : 객체의 순차탐색, 몇 번 반복 ... 
#------------------------------------------------------------------
# while 문
#  - 조건에 의해 반복 하는 반복문
#  - 조건에 의해 동작하는 조건문과 유사한 형태를 갖는다.
#  - 형태 
#       while 조건 :
#           수행할 코드
#           수행할 코드
#           코드 수행이 끝나면 
#           while 문의 조건을 검사
#  - 사용해야 하는 이유
#     - 반복되는 코드를 하나의 코드로 작성할 수 있다.
#     - 반복되는 횟수를 유동적으로 지정할 수 있다.
#  - 주의 할 점
#       - 만약 조건을 잘못 작성하거나 조건이 항상 True 가 되는 경우(= 무한 루프)
#         → ctrl+c 누르면 종료된다.
#       - 조건A 를 만족하는 동안 반복
#           → 사용자가 0 을 입력하는 동안 거북이를 이동
#           → 조건A = 반복 수행을 하기 위한 조건
#         조건B 를 만족할 때 까지 반복
#           → 사용자가 0 을 입력할 때 까지 거북이를 이동
#           → 조건B = 반복 수행을 끝내기 위한 조건
print('-' * 50)
print('No Loop')
# 'Hello World!' 를 다섯번 출력
print('Hello World!')
print('Hello World!')
print('Hello World!')
print('Hello World!')
print('Hello World!')
# → 중복된 코드가 많아지면서 유지보수가 비효율적이다. 
#   ex) 'World' 를 'Python' 으로 수정하라! → 중복된 수만큼 작업
# → 명령어로 다섯번 작성한 것이기 때문에 횟수는 고정이다.
print('-' * 50)
print('while statement')
# 'Hello World!' 를 다섯 번 출력
#   카운팅(Counting)
#     - 카운트를 저장하기 위한 변수가 필요
#     - 카운트 검사
#     - 기능 수행 후 카운팅

# 출력 횟수를 저장하는 변수
# 한 번도 출력하지 않았기 때문에 0으로 초기화
count = 0
MAX = 5 # 최대 출력 횟수를 저장하는 변수 

# count 의 값이 5가 될 때 까지 반복
#  = count 의 값이 5가 되면 종료
while count < MAX :
    n = 0 # 반복할 때 마다 0으로 초기화가 된다.
    # 매 반복마다 새로운 변수를 사용하는 경우에
    # 블록 내에서 변수를 초기화한다.
    #------------------------------------------
    print(f'{count} : Hello World! #{n}')

    # 출력을 했기 때문에 출력 횟수를 1 증가
    count += 1
    n += 5

print('-' * 50) 
# 1 <= n <= 10 사이의 값을 출력
# print(1)
# print(2)
# print(...)
# print(9)
# print(10)
# → 출력되는 값이 모두 달라도
#   규칙성을 찾아서 하나의 코드로 만들 수 있어야한다.
# 
# 1 부터 10까지 1씩 증가 
n = 1 # 1 부터 1씩 증가할 변수
MAX = 10
# 10이 될 때 까지 반복
while n <= MAX :
    print(f'n = {n}')
    # 그 다음 숫자가 출력될 수 있도록
    # n 의 값을 1 증가
    n += 1

print('-' * 50) 
# for 문
#  - 스퀀스 객체와 같이 반복 가능한 객체를 다룰 때 사용
#     ex) list, tuple, range(), enumerate() ... 
#  - 형태
#     for 변수 in 객체 :
#        반복 수행할 코드
#        반복 수행할 코드
#     변수에는 객체의 원소가 하나씩 차례대로 대입

# 1 <= n <= 10 까지 출력
MIN = 1
MAX = 10
numbers = list(range(MIN, MAX + 1)) # range 의 범위 : 1 <= n < 11
print(f'numbers = {numbers}')
# numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for n in numbers :
    print(f'n = {n}')

# 리스트 생성 없이 range() 함수를 통해 특정 범위의 값들을 이용할 수 있다.
for n2 in range(MIN, MAX+1) :
    print(f'n2 = {n2}')

print('-' * 50) 
# 'Hello World!' 다섯 번 출력
MAX_COUNT = 5 # 최대 5번

for count in range(MAX_COUNT) : # 0 <= count < MAX_COUNT
    print('Hello World!')

print('-' * 50) 
# 1 <= n <= 10 사이의 정수를 역순으로 출력
MIN = 1
MAX = 10
# numbers = list(range(MIN, MAX+1))
# numbers.reverse()
# print(f'numbers = {numbers}')
# for n in numbers :
#     print(f'n = {n}')

for n in range(MAX, MIN-1, -1) :
    print(f'n = {n}')

print('-' * 50) 
# 100 <= n < 150 사이의 정수들 중에서 짝수만 출력
MIN = 100
MAX = 150

for n in range(MIN, MAX, 1) :
    # n 의 값이 짝수일 때 출력
    if n % 2 == 0:
        print(f'n = {n}')
print('-' * 50) 

# flag = 0 if MIN % 2 == 0 else 1
flag = MIN % 2 # 짝수 : 0, 홀수 : 1
for n in range(MIN + flag, MAX, 2) :
    # n 의 값이 짝수일 때 출력
    # if n % 2 == 0:
        print(f'n = {n}')

print('-' * 50) 