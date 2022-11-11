# File02_output.py

# 대부분의 프로그램은 사용자의 입력(요구)에 따라 그에 맞는 결과를 출력(제공)
#  입력 → 연산/처리(프로그램 제어/함수 등) → 출력

# 출력(Output)
#   - 프로그램에서 외부로 데이터가 전달되는 것
#   - 모니터, 파일 저장, 메세지 발신 등

# 출력하는 방법
#   - print() 함수
#   - print(value, ..., sep=' ', end='\n', file=sys.stdout, flush=False)
#       - value : 출력할 데이터
#       - ...   : 임의의 수의 데이터를 의미
#       - sep   : 구분자, 기본 값은 ' '
#       - end   : 마지막 문자열, 기본 값은 '\n' = 개행
#       - file  : 출력 장치 지정, 기본 값 sys.stdout = 모니터
#       - flush : 스트림 비우기, 기본 값은 False = 비우지 않는다.
print(10, 20, 30, 40, sep=', ', end=' 입니다.\n')
print(10, 20, 30, 40)
#============================================================
# 문자열 포매팅(Formatting)

#  1. 서식 지정자(Format specifier)
# '나의 이름은 OOO이고, 나이는 OO세 입니다.'
name = '홍길동'
age = 30
str1 = '나의 이름은 %s이고, 나이는 %d 세 입니다.' % (name, age)
print(str1)

name = '김철수'
age = 27
str2 = '나의 이름은 %s이고, 나이는 %d 세 입니다.' % (name, age)
print(str2)

str_format = '나의 이름은 %s이고, 나이는 %d 세 입니다.'
str3 = str_format % (name, age)
print(str3)

#-------------------------------------------------------------------
# 2. 문자열의 format() 함수(메서드)를 이용
#      - 문자열 서식에 데이터가 들어갈 자리를 중괄호로 작성

# 작성된 순서에 따라 값이 전달
#  - 개수는 맞춰주는 것이 중요
str1 = 'My name is {}. And My age is {}.'.format('홍길동', 30)
print(str1)

# 중괄호 내에 인덱스를 작성하여, 인자 값의 순서에 맞춰 대입된다.
#  인덱스를 지정함으로써 중복된 데이터를 재사용하여 대입할 수 있다.
str1 = 'My name is {0}. And My age is {1}. - {0}'.format('홍길동', 30)
print(str1)

# 중괄호 내에 별칭을 작성하여, 인자 값을 전달할 때 별칭을 통해 대입된다.
# format 메서드에 작성된 별칭은 '변수가 아님'을 기억해야한다.
str1 = 'My name is {name}. And My age is {age}. - {name}'.format(age=30, name='홍길동')
print(str1)

# f-string
#   파이썬 3.6 이후에 생긴 기능이며
#   format() 메서드와 동일한 지정자를 사용
#   다만, 별칭대신 변수를 지정할 수 있다.
name = 'mike'
print(f'Hello, My name is {name}.')

year = 2022
month = 4
day = 3
print(f'{year}년 {month:02}월 {day:02}일')



















