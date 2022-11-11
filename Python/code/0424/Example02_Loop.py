
# 리스트에 저장된 요소들 중에서
# 값이 가장 큰 요소와 해당 요소의 인덱스를 출력
list1 = [20, 15, 7, 11, 32, 0, 6, 16, 21] 
#-----------------------------------------
# list_copy = list1.copy()
# list_copy.sort()
# max = list_copy[0]
# max_index = list1.index(max)
#-----------------------------------------
# 리스트에 저장된 원소들 중에서 가장 큰 값의 인덱스
max_index = 0 # '인덱스 0 번이 가장 크다'

# for n in list1[1 : ] : 
#     변수 n 에 값이 넘어감, 인덱스를 별도로 구해야함
#     pass 

# 인덱스 1 부터 끝까지 
for i in range(1, len(list1)) :
    # max_index 에 위치한 값보다
    # i 번째에 위치한 값이 더 크면
    # i 번째를 기억해야한다.
    if list1[max_index] < list1[i] :
        max_index = i

print(f'max_index = {max_index}')
print(f'max_value = {list1[max_index]}')
