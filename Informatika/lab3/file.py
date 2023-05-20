from re import *
# =====1=====
from re import findall, split
# with open('Tst1.txt', 'r') as file:
#     for i, x in enumerate(file.readlines()):
#         test, res = x.split(';')
#         print(len(findall(r'8</',test)))

# ======2========
for j in range(1, 6):
    with open(f'test{j}.txt', encoding='utf-8') as file:
        n = file.read()
        print(f"\nTest {j}:")
        print(n,'\n')
        res = findall("[А-Я][а-я]+\s[А-Я].[А-Я].",n)
        res.sort()
        for i in res:
            print(i.split()[0])
