import React, { useState, useEffect } from "react";


export const Component: React.FC = () => {
  const [word, setWord] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/hello", { method: "GET" })
    .then(res => res.text())
    .then(data => setWord(data));
  });

  return (
    <h1>{word}</h1>
  );
};