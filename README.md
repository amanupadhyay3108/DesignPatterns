Strategy Design Pattern – Robot Example

This project demonstrates the Strategy Design Pattern using a simple robot system.
The Strategy Pattern allows defining a family of algorithms (or behaviors), encapsulating each one, and making them interchangeable at runtime.
It helps achieve flexibility, reusability, and avoiding code duplication by using composition instead of inheritance.

📌 Problem

Imagine we are designing robots with different abilities:

Some robots can walk, others cannot.

Some can talk, others remain silent.

Some can fly, while others are grounded.

If we used inheritance only, we would end up with a large hierarchy of classes for every possible combination of abilities (e.g., WalkingTalkingRobot, FlyingSilentRobot, etc.).
This becomes rigid and hard to maintain.

✅ Solution: Strategy Pattern

We separate behaviors (walk, talk, fly) into interfaces and their implementations.
Then, instead of hardcoding abilities inside robots, we inject behavior objects at runtime.

Walk behaviors: NormalWalk, NoWalk

Talk behaviors: NormalTalk, NoTalk

Fly behaviors: NormalFly, NoFly

Each robot (CompanionRobot, WorkerRobot, etc.) delegates its actions to these strategies.
