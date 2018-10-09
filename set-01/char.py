c=input()
if len(c)==1 and c.isalpha():
    vowel=['a','e','i','o','u']
    if c in vowel:
        print('Vowel')
    else:
        print('Consonant')
else:
    print('Invalid')