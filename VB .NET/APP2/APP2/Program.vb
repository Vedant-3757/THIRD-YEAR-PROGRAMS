Module program
    Sub main()
        Console.WriteLine("Enter your First Value : ")
        Dim y As Integer = Console.ReadLine()
        Console.WriteLine("Enter your Second Value : ")
        Dim z As Integer = Console.ReadLine()
        Console.WriteLine("Choose an Operation ( + , - , * , / ) : ")
        Dim a As String = Console.ReadLine()
        If a = "+" Then
            Console.WriteLine("<---You Choosed Addtion--->")
            Console.WriteLine($"The Addition of {y} & {z} is : " & y + z)
        ElseIf a = "-" Then
            Console.WriteLine("<---You Choosed Substraction--->")
            Console.WriteLine($"The Substraction of {y} & {z} is : " & y - z)
        ElseIf a = "*" Then
            Console.WriteLine("<---You Choosed Multiplication--->")
            Console.WriteLine($"The Multiplication of {y} & {z} is : " & y * z)
        ElseIf a = "/" Then
            Console.WriteLine("<---You Choosed Division--->")
            Console.WriteLine($"The Division of {y} & {z} is : " & y / z)
        Else
            Console.WriteLine("<---You Choosed Invalid Operation--->")
            Console.WriteLine($"Your Entered Values are : First Num {y} & Second Num {z}")
        End If
    End Sub
End Module