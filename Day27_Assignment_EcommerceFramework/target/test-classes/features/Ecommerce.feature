Feature: E-Commerce End-to-End Flow

Scenario Outline: Complete shopping process

Given User launches browser
When User logs in using "<username>" and "<password>"
And User adds multiple products to cart
And User removes one product from cart
Then User validates total amount
And User proceeds to checkout
And User logs out

Examples:
| username | password |
| standard_user | secret_sauce |