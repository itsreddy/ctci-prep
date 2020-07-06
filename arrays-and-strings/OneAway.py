def one_away(str1, str2):
    if abs(len(str1) - len(str2)) > 1:
        return False

    if len(str1) < len(str2):
        str1, str2 = str2, str1
    
    edits = 0
    idx = 0
    for char in str1:
        if str2[idx] != char:
            edits += 1
            idx -= 1
        
        idx += 1
        

str1 = "pale"
str2 = "ple"