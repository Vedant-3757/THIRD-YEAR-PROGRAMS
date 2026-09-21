Module program
    Sub main()
        Console.WriteLine("Enter First Num : ")
        Dim a As Integer = Console.ReadLine()
        Console.WriteLine("Enter Second Num : ")
        Dim b As Integer = Console.ReadLine()
        Console.WriteLine("Enter Third Num : ")
        Dim c As Integer = Console.ReadLine()
        Console.WriteLine("Enter Fourth Num : ")
        Dim d As Integer = Console.ReadLine()
        Console.WriteLine("Enter Fifth Num : ")
        Dim e As Integer = Console.ReadLine()
        Try
            If a > 0 Then
                If a Mod 2 = 0 Then
                    Console.WriteLine("First Value is Positive & " & a & " is Square root of " & Math.Sqrt(a))
                Else
                    Console.WriteLine("First Value is Odd")
                End If
            Else
                Throw New Exception("The first number is Negative")
            End If
        Catch ex As Exception
            Console.WriteLine(ex.Message)
        End Try
        Try
            If b > 0 Then
                If b Mod 2 = 0 Then
                    Console.WriteLine("Second Value is Positive & " & b & " is Square root of " & Math.Sqrt(b))
                Else
                    Console.WriteLine("Second Value is Odd")
                End If
            Else
                Throw New Exception("The Second number is Negative")
            End If
        Catch ex As Exception
            Console.WriteLine(ex.Message)
        End Try
        Try
            If c > 0 Then
                If c Mod 2 = 0 Then
                    Console.WriteLine("Third Value is Positive & " & c & " is Square root of " & Math.Sqrt(c))
                Else
                    Console.WriteLine("Third Value is Odd")
                End If
            Else
                Throw New Exception("The Third number is Negative")
            End If
        Catch ex As Exception
            Console.WriteLine(ex.Message)
        End Try
        Try
            If d > 0 Then
                If d Mod 2 = 0 Then
                    Console.WriteLine("Fourth Value is Positive & " & d & " is Square root of " & Math.Sqrt(d))
                Else
                    Console.WriteLine("Fourth Value is Odd")
                End If
            Else
                Throw New Exception("The Fourth number is Negative")
            End If
        Catch ex As Exception
            Console.WriteLine(ex.Message)
        End Try
        Try
            If e > 0 Then
                If e Mod 2 = 0 Then
                    Console.WriteLine("Fifth Value is Positive & " & e & " is Square root of " & Math.Sqrt(e))
                Else
                    Console.WriteLine("Fifth Value is Odd")
                End If
            Else
                Throw New Exception("The Fifth number is Negative")
            End If
        Catch ex As Exception
            Console.WriteLine(ex.Message)
        End Try

    End Sub
End Module