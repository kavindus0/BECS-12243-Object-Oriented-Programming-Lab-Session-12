<head>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        td {
            background-color: #f9f9f9;
        }
        .yes {
            background-color: lightgreen;
        }
        .no {
            background-color: lightcoral;
        }
    </style>
</head>
<body>

<h2>Variable vs Object Type Grid</h2>

<table>
    <thead>
        <tr>
            <th>Variable Type</th>
            <th>Tossable</th>
            <th>Ball</th>
            <th>Rock</th>
            <th>Baseball</th>
            <th>Football</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Tossable</td>
            <td>—</td>
            <td>—</td>
            <td>—</td>
            <td>—</td>
            <td>—</td>
        </tr>
        <tr>
            <td>Ball</td>
            <td class="yes">✓</td>
            <td class="yes">✓</td>
            <td class="no">X</td>
            <td class="no">X</td>
            <td class="no">X</td>
        </tr>
        <tr>
            <td>Rock</td>
            <td class="yes">✓</td>
            <td class="no">X</td>
            <td class="yes">✓</td>
            <td class="no">X</td>
            <td class="no">X</td>
        </tr>
        <tr>
            <td>Baseball</td>
            <td class="yes">✓</td>
            <td class="yes">✓</td>
            <td class="no">X</td>
            <td class="yes">✓</td>
            <td class="no">X</td>
        </tr>
        <tr>
            <td>Football</td>
            <td class="yes">✓</td>
            <td class="yes">✓</td>
            <td class="no">X</td>
            <td class="no">X</td>
            <td class="yes">✓</td>
        </tr>
    </tbody>
</table>

</body>