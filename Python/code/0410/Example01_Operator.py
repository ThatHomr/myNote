# 1. 임의의 초 단위의 정수 값을 입력을 받아서
#    몇시간 몇분 몇초인지 변환하여 출력하는 프로그램을 작성.

# 초 단위의 정수를 입력
time = int( input('Enter an integer in seconds >>> ') )
# input() 함수의 결과 값의 타입은 '문자열(str)'이기 때문에
# 정수처럼 다룰 수 없다. → 정수형(int)으로 변환해주는 변환 함수를 이용

# 시간 / 1h = 60m = 3600s
hour = time // 3600 # / 연산자 = 실수, // 연산자 = 정수(몫)
# 분 / 1m = 60s
minute = (time % 3600) // 60
# 초
second = time % 60

# 출력
print(f'{hour:02} : {minute:02} : {second:02}')












