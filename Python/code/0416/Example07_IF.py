# Example07_IF.py


# 조건
#   3의 배수인 경우 : Fizz
#   5의 배수인 경우 : Buzz
#   3의 배수이면서 5의 배수인 경우 : FizzBuzz
#   그 외인 경우 : 정수 값

n = int(input('Enter an integer >>> '))

if (n % 3 == 0) and (n % 5 == 0) :
    res = 'FizzBuzz'
elif n % 3 == 0 :
    res = 'Fizz'
elif n % 5 == 0 :
    res = 'Buzz'
else :
    res = n

print(f'>>> {res}')


