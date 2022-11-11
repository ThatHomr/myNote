# File02_List.py


# 파이썬에서는 저장 공간에 데이터를 저장하는 것이 아닌
# 데이터가 저장된 위치(주소)를 저장한다.
# 파이썬에서는 대입 연산자를 통해서 값을 전달하게 되면
# 실제로 값이 복사되는 것이 아닌 위치(주소)가 복사된다
# → 데이터의 복사가 아닌 데이터를 공유하게 된다.

list1 = [1, 2, 3, 4, 5]
list2 = list1  # 같은 리스트를 참조하여 공유하게된다.
list3 = list1.copy()  # 동일한 원소를 가진 리스트로 복사
list4 = list1[ : ]    # 슬라이싱을 통해서 리스트를 복사
print(f"list1 = {list1}")
print(f"list2 = {list2}")
print(f"list3 = {list3}")
print(f"list4 = {list4}")
print("-" * 30)
list1[0] = 100

print(f"list1 = {list1}")
print(f"list2 = {list2}")
print(f"list3 = {list3}")
print(f"list4 = {list4}")
print("-" * 30)

n = list1.pop()  # 마지막 요소를 꺼낸다.(즉, 삭제하고 반환)
print(f"n = {n}")
print(f"list1 = {list1}")

n = list1.pop(0)  # 인덱스 0의 요소를 꺼낸다.(즉, 삭제하고 반환)
print(f"n = {n}")
print(f"list1 = {list1}")

d = 3
if d in list1:
    list1.remove(d)  # 요소의 값을 지정하여 삭제
print(f"list1 = {list1}")

print('-'*30)
list4 = [1, 3, 7, 4, 2, 9, 0, 3]
print(f"list4 = {list4}")
list4.reverse() # 역순으로 배치, 정렬 X
print(f"list4 = {list4}")
list4.sort() # 오름차순 정렬
print(f"list4 = {list4}")
list4.sort(reverse=True) # 내림차순 정렬
print(f"list4 = {list4}")

# -----------------------------------------------
print('-'*30)
# 컬렉션과 같이 사용되는 함수
#  - len()   : 요소의 개수를 반환하는 함수
#  - range() : 범위를 표현하는 함수
length = len(list4)
print(f'list4 = {list4}')
print(f'list4\'s length = {length}')

r = range(10)       # 0 <= n < 10 
r = range(5, 10)    # 5 <= n < 10 
r = range(5, 10, 2) # 5 <= n < 10 
listR = list(r)
listR2 = list( range(1, 101) )
print(f'range(10) = {r}')
print(f'listR = {listR}')
print(f'listR2 = {listR2}')

print('-'*30)
list5 = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
list5 = list(range(10, 101, 10))
print(f'list5 = {list5}')

sub = list5[2 : 7]
print(f'sub = {sub}')
sub_data = sub[1]
print(f'sub_data = {sub_data}')
sub_data = list5[2:7][1]
print(f'sub_data = {sub_data}')


