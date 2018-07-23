package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CSVTest {

	public static void main(String[] args) throws IOException {
		HashSet<String> descMap = new HashSet<>();
		String line;
		// read all lines
		try (BufferedReader br1 = new BufferedReader(new FileReader("./src/file1.csv"))) {
			while ((line = br1.readLine()) != null) {
				descMap.add(line);
			}
		}
		List<String> matched = new ArrayList<>();
		// read the line and check in previous set
		try (BufferedReader br = new BufferedReader(new FileReader("./src/file2.csv"))) {
			while ((line = br.readLine()) != null) {
				if (descMap.contains(line)) {
					matched.add(line);
				}
			}
		}
		// output all matched
		Path outFile = Paths.get("./src/item_match.csv");
		Files.write(outFile, matched, Charset.defaultCharset(), new LinkOption[0]);
	}
}