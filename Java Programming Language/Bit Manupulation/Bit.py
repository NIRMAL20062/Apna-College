text = "Bardx"
binary_list = [format(ord(char), '08b') for char in text]
print(" ".join(binary_list))
# Convert binary back to text
binary_string = "".join(binary_list)
text = "".join([chr(int(binary_string[i:i+8], 2)) for i in range(0, len(binary_string), 8)])
print(text)

# ! This is an important warning     <-- Red
# * This is a highlighted note       <-- Blue or Cyan
# TODO: Fix this later               <-- Orange
# ? Is this working correctly?       <-- Yellow
# // Normal comment                  <-- Default
 