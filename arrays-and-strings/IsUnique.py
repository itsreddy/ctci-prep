def is_unique(str):
    hash_table = dict()

    for char in str:
        if char in hash_table:
            return "Not Unique"
        else:
            hash_table[char] = 1
    return "Unique"

# main
print(is_unique("abcdefga"))