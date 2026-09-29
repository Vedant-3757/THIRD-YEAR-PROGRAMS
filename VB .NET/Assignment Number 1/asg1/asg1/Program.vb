
'Q1
'Module program
'    Sub main()
'        Console.WriteLine("Enter INT input : ")
'        Dim a As Integer = Console.ReadLine()
'        Console.WriteLine("Enter FLOAT input : ")
'        Dim b As Single = Console.ReadLine()
'        Console.WriteLine("Enter CHAR input : ")
'        Dim c As Char = Console.ReadLine()
'        Console.WriteLine("Enter STRING input : ")
'        Dim d As String = Console.ReadLine()
'        Console.WriteLine("INT : " & a)
'        Console.WriteLine("FLOAT : " & b)
'        Console.WriteLine("CHAR : " & c)
'        Console.WriteLine("STRING : " & d)
'    End Sub
'End Module



'Q2
'Module program
'    Sub main()
'        Dim a As Integer
'        Dim b As Integer
'        Dim c As Integer
'        Console.WriteLine("Enter First num : ")
'        a = Convert.ToInt16(Console.ReadLine())
'        Console.WriteLine("Enter Second num : ")
'        b = Convert.ToInt16(Console.ReadLine())
'        c = a + b
'        Console.WriteLine($"The sum of {a} & {b} is {c}")
'    End Sub
'End Module


'Q3
'Module program
'    Sub main()
'        Console.WriteLine("Enter num : ")
'        Dim a As Integer = Console.ReadLine()
'        If a Mod 2 = 0 Then
'            Console.WriteLine("Number is even")
'        Else
'            Console.WriteLine("Number is odd")
'        End If

'    End Sub
'End Module



'Q4
'Module program
'    Sub main()
'        Console.WriteLine("Enter num : ")
'        Dim a As Integer = Console.ReadLine()
'        Dim fact As Integer
'        fact = 1
'        For i As Integer = 1 To a
'            fact = fact * i
'        Next
'        Console.WriteLine($"Factorial of {a} is {fact}")
'    End Sub
'End Module







'Q5
Module program
    Sub main()
        For i As Integer = 1 To 100
            If i Mod 5 = 0 Then
                Console.WriteLine(i)
            End If

        Next
    End Sub
End Module