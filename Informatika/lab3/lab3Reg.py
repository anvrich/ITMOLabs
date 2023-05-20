from re import findall, match, search,split
inp = input("TEST or Input: ")
if(inp == 'Input'):
    text = input()
    sml = r'8</'
    res = findall(sml, text)
    print(len(res))

else:
    with open('test.txt', 'r') as file:
        for i, x in enumerate(file.readlines(), start=1):
            test, res = x.split(';')
            print(len(findall(r'8</', test)))




# ========Задание 2 =========
# txt = "Студент Вася вспомнил, что на своей лекции Балакшин П.В. упоминал про старшекурсников, которые будут ему помогать: Анищенко А.А. и Машина Е.А."
# print(*sorted(map(lambda x: x.split()[0], findall(r'[А-Я][а-я]+\s[А-Я].[А-Я].', txt))))
