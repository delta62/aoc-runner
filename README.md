# aoc-runner

Command line runner for Clojure [Advent of Code](https://adventofcode.com/)
projects

## Features

* Downloads input files from the AoC website
* Automatically detects solution files and runs them
* Provides nice CLI output with run times of solutions

![CLI Screenshot](/screenshot.png?raw=true "CLI Screenshot")

## Usage

`aoc-runner` finds packages named `aoc.day<n>`, and looks for functions named
`part1` and `part2`. Each function is called with the puzzle input as an
argument, and should return the solution for the given day & part.

You may optionally define a function named `parse`, which will be run before
the solution functions. When `parse` is provided, it is passed the input string
and its return value is passed to `part1` and `part2` instead of the raw input.

### Downloading puzzle input

`aoc-runner` searches for puzzle input under `resources/input/day<n>.txt`. If
input for a day can't be found, it will attempt to download it from the AoC
website. Since puzzle input is unique to each user, you need to provide a
session token for `aoc-runner` to use when downloading. You can find this in
your session cookie on the AoC website. Paste the value into a file named
`.aoc-session` in your working directory.

### API

* **`(run-latest [year])`**: Run the latest day that a package exists for
* **`(run-all [year])`**: Run all puzzles for a given year
* **`(run-day [year day])`**: Run a specific day's solver
