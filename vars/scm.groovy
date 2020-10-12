#!/usr/bin/env groovy

def checkOutFrom(repo) {
  git url: "tvanantha@github.com:tvanantha/${repo}"
}

return this 
