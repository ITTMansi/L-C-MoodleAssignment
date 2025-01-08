def calculate_armstrong_sum(number):
    """Calculate the sum of each digit raised to the power of the number of digits."""
    armstrong_sum = 0
    digit_count = 0


    temp_number = number
    while temp_number > 0:
        digit_count += 1
        temp_number //= 10


    temp_number = number
    while temp_number > 0:
        digit = temp_number % 10
        armstrong_sum += digit ** digit_count
        temp_number //= 10

    return armstrong_sum

user_input = int(input("Enter a number to check if it is an Armstrong number: "))

if user_input == calculate_armstrong_sum(user_input):
    print(f"\n{user_input} is an Armstrong number.\n")
else:
    print(f"\n{user_input} is not an Armstrong number.\n")
