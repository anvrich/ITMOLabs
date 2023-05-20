# ======1==========
from re import findall, split
# text = input()
# res = findall(r'8</', text)
# print(len(res))

#======2========
# txt = input()
# res1 = findall(r'[А-Я][а-я]*\s+[А-Я].{2}', txt)
# res1.sort()
# for i in res1:
#     print(i.split()[0])

# ========3=========
from  re import *
# test = input('Введите текст: ')
test = "КоРмА КооРооА КоРзА КуРуА КоРкА КаРвА КоРбА КоРчмА КоРмФздА КкКкК ККККК"
# res = findall(r"\s*К[^кра]{2}Р[^кра]{2}А", test)
# res = findall(r"\s*К?:([^кра]{2})Р\1А", test)
res=findall(r"\s*К[^кра]Р[^кра]А", test)
# res=findall(r"(\s*К([^кра])Р\2А)",test)

print(res)
