@pw_length
@bool1 = false
@bool2 = false
@bool3 = false
def get_pw
	puts "Enter an 8 character or more password with at least one letter, one number, and one special character."
	@pw = gets.chomp
	pw_array = @pw.split("")
	@pw_array_length = pw_array.length
end

def pw_check(password, number, letter, special)
	if(@pw_array_length >= 8 && @bool1 == true && @bool2 == true && @bool3 == true)
		puts "The password is valid."
	else
		puts "The password isn't valid."
	end
end

def letter?
	array = @pw.split("")
	letters = "abcdefghijklmnopqrstuvwxyz"
	letters_array = letters.split("")
	up_letters = letters.upcase!
	up_letters_array = up_letters.split("")
	array.each do |x|
		letters_array.each do |y|
			up_letters_array.each do |z|
				if x == y || x == z
					@bool2 = true
				end
			end
		end
	end
end

def numeric?
	array = @pw.split("")
	numbers = "0123456789"
	num_array = numbers.split("")
	array.each do |x|
		num_array.each do |y|
			if x == y
				@bool1 = true
			end
		end
	end
end

def special?
	array = @pw.split("")
	special_chars = "!@#$%^&*()"
	spec_array = special_chars.split("")
	array.each do |x|
		spec_array.each do |y|
			if x == y
				@bool3 = true
			end
		end
	end
end

pw_check(get_pw, numeric?, letter?, special?)
