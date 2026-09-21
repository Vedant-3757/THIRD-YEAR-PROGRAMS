Module program
    Sub main()

        Console.WriteLine("Enter Num you want to Check : ")
        Dim a As Integer = Convert.ToInt16(Console.ReadLine())

        If a > 0 Then
            Console.WriteLine("The Number is Positive")
            If a Mod 2 = 0 Then
                Console.WriteLine("The Number you Entered is Positive Even")
            ElseIf a Mod 2 <> 0 Then
                Console.WriteLine("The Number you Entered is Negative Odd")
            End If

        ElseIf a < 0 Then
            Console.WriteLine("The Number is Negative")
            If a Mod 2 = 0 Then
                Console.WriteLine("The Number you Entered is Negative Even")
            ElseIf a Mod 2 <> 0 Then
                Console.WriteLine("The Number you Entered is Negative Odd")
            End If

        Else
            Console.WriteLine("You have not Entered a Number !!")

        End If

    End Sub
End Module