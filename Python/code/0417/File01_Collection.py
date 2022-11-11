# File01_Collection.py

# 컬렉션(Collection)
#  - 다수의 데이터를 관리하는 타입 중 
#  - 여러 데이터를 하나의 식별자로 관리하는 자료형
#  - 컬렉션 중에서도 데이터들의 순서가 있는 컬렉션을 '스퀀스(Sequence)'라고 부른다.
#       → 문자열, 리스트, 튜플..
#  - 종류
#       - 리스트   : 추가, 수정, 삭제가 가능한 배열          
#       - 튜플     : 리스트와 유사하나 데이터의 수정이 불가능한 배열             
#       - 셋(세트) : 중복 저장이 불가능한 배열         
#       - 딕셔너리 : (key + value)를 쌍으로 하는 배열
#  - 사용하는 이유 
#       - 저장할 수 있는 데이터의 수가 제한이 없다.
#       - 사용자가 원하는 값을 식별하고 찾기가 쉽다.
#       - 제어문을 통해 연산/처리를 효율적으로 할 수 있다.
#       - 알고리즘/자료구조에서 많이 사용되는 타입이다.
#----------------------------------------------------------------------------------

# 리스트(list)
list1 = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
print('-'*50)
print(f'list1 = {list1}')
# 인덱싱
print(f'list1[2] = {list1[2]}')
# 슬라이싱
print(f'list1[3 : 6] = {list1[3:6]}') # 3 <= index < 6

print('-'*50)
print(f'list1 = {list1}')
# 인덱싱을 통해 요소를 수정
list1[0] = 15
print(f'list1 = {list1}')
# 슬라이싱을 통해 요소를 수정
list1[0 : 4] = [11, 22, 33, 44]
print(f'list1 = {list1}')
# 슬라이싱을 통해 요소를 추가
list1[0 : 4] = [11, 22, 33, 44, 44.5, 44.7, 44.9]
print(f'list1 = {list1}')
# 슬라이싱을 통해 요소를 삭제
list1[0 : 4] = []
print(f'list1 = {list1}')
# 슬라이싱을 통해 요소를 삽입
list1[0:0] = [10, 20, 30, 40]
print(f'list1 = {list1}')
#------------------------------------------------
words = 'hello python java progamming academy'.split(' ')
print(f'words = {words}')

# 스퀀스 객체의 요소의 수와 변수의 수가 일치하면
# 각 변수에 요소가 저장된다.
subject1, subject2 = ['java', 'python']
print(f'subject1 = {subject1}')
print(f'subject2 = {subject2}')

map_a = map(int, '1 2'.split(' ') );
# a, b = map(int, ['1', '2'] );
print(f'map = {map_a}')

a, b = map_a
print(f'a = {a}, type = {type(a)}')
print(f'b = {b}, type = {type(b)}')

map_b = map(int, '1 2'.split(' ') )
list2 = list(map_b)
print(f'list2 = {list2}')

# 다수의 데이터를 입력
strings = input('>>> ').split(' ')
numbers = list( map(int, input('>>> ').split(' ')) )