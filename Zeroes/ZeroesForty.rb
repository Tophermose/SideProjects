def zeroesforty
	for i in -100..100
		if (i*i*i*i) + (2*(i*i*i)) + (10*(i*i)) + (18 * i) + 9 == 0
			puts "#{i} is the zero"
		end
	end
end

zeroesforty
