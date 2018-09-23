def player_guess
	puts "Enter Rock, Paper, or Scissors"
	@choice = gets.chomp
	@choice.capitalize!
end

def comp_guess
	num = 1 + rand(3)
	if num == 1
		@guess = "Rock"
	elsif num == 2
		@guess = "Paper"
	elsif num == 3
		@guess = "Scissors"
	end
end

def game_play(comp, player)
	bool = false
	loop do
		if @guess == "Rock" && @choice == "Scissors"
			puts "Computer wins!"
			bool = true
		elsif @guess == "Rock" && @choice == "Paper"
			puts "Player wins!"
		elsif @guess == "Paper" && @choice == "Rock"
			puts "Computer wins!"
			bool = true
		elsif @guess == "Paper" && @choice == "Scissors"
			puts "Player wins!"
		elsif @guess == "Scissors" && @choice == "Paper"
			puts "Computer wins!"
			bool = true
		elsif @guess == "Scissors" && @choice == "Rock"
			puts "Player wins!"
		elsif @guess == @choice
			puts "It's a tie!"
		end
		break if bool == true
		player_guess
		puts "Computer chose #{@guess}"
	end
end
game_play(comp_guess, player_guess)
