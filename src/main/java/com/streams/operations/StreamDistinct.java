package com.streams.operations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinct {

	public static void main(String[] args) {
		Stream<Integer> rhymeStream = Stream.of(1,45,65,43,7,5,2,5,45,5,5,5,5,5,42,21,12);
		List<Integer> collect = rhymeStream.distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}

}
