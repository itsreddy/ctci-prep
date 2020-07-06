def one_away(str1, str2):
    if abs(len(str1) - len(str2)) > 1:
        return False

    if abs(len(str1) - len(str2)) == 1:
        edits = 0
        idx = 0
        for char in str1:
            if str2[idx] != char:
                edits += 1
                if edits == 1:
                    idx -= 1
            idx += 1
    elif len(str1) == len(str2):
        edits = 0
        idx = 0
        for char in str1:
            if str2[idx] != char:
                edits += 1
            idx += 1
    
    if edits > 1:
        return False
    return True
        

str1 = "brle"
str2 = "frfe"

print(one_away(str1, str2))