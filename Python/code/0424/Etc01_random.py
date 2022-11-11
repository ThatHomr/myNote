# Etc01_random.py

import random

# random 모듈
#  - 난수를 만들어주는 모듈
#  - '랜덤' 이라는 기능 지원

r = random.randrange(101) # 0 <= r < 101
print(f'r = {r}') 
r = random.randrange(50, 101) # 50 <= r < 101
print(f'r = {r}') 

list1 = []
for i in range(10) :
    list1.append(random.randrange(101))
print(f'list1 = {list1}')

# 셔플 = 요소들을 섞는다.
random.shuffle(list1)
print(f'list1 = {list1}')

choice = random.choice(list1)
print(f'choice = {choice}')

deck = list1.copy()
for i in range( len(deck) ) :
    p = random.randrange( len(deck) )
    n = deck.pop(p)
    print(f'deck = {deck} / n = {n}')


print('-' * 50)
# 리스트 내포(List Comprehension)
list2 = [random.randrange(101) for i in range(10)]
print(f'list2 = {list2}')

list2_even = ['n = ' + str(n) for n in list2 if n % 2 == 0]
print(f'list2_even = {list2_even}')
