import random

def roll_dice(sides):
    """Generate a random number representing a dice roll."""
    return random.randint(1, sides)

def main():
    dice_sides = 6
    keep_rolling = True

    while keep_rolling:
        user_input = input("Ready to roll the dice? Enter 'Q' to quit: ")

        if user_input.lower() != "q":
            roll_result = roll_dice(dice_sides)
            print(f"You have rolled a {roll_result}")
        else:
            keep_rolling = False

