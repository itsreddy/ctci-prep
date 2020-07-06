def construct_hash_table(str):
    hash_table = dict()
    for char in str:
        if char in hash_table:
            hash_table[char] += 1
        else:
            hash_table[char] = 1
    return hash_table

def check_permutation(str1, str2):
    str1_hash_table = construct_hash_table(str1)
    str2_hash_table = construct_hash_table(str2)

    if len(str1) > len(str2):
        first_table, second_table = str1_hash_table, str2_hash_table
    else:
        first_table, second_table = str2_hash_table, str1_hash_table
    for char in first_table:
        if char not in second_table or \
            first_table[char] != second_table[char]:
            return "not permutation"
    return "permutation"

# main

str1 = "ababa"
str2 = "abbaa"

print(check_permutation(str1, str2))